/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.qrest;

import org.jpos.log.AuditLogEvent;
import org.jpos.log.AuditLogEventConvertible;
import org.jpos.qrest.evt.HttpParamsEvt;
import org.jpos.util.Loggeable;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * HTTP parameter multimap that masks sensitive values whenever it is logged.
 *
 * <p>Participants and handlers read the real values through the regular
 * {@link Map} interface, but every log rendering — the {@link Loggeable}
 * dump used by {@code Context}'s XML output, {@link #toString()}, and the
 * structured {@link HttpParamsEvt} produced by {@link #toAuditEvent()} for
 * JSON/JSONL log writers — replaces the values of sensitive-looking
 * parameters (e.g. {@code password}, {@code pin}, {@code token}) with
 * {@code ***}.</p>
 *
 * <p>Masking is always on and cannot be disabled; callers may only extend
 * the built-in name list (see {@link ExtractFormParams}'s
 * {@code masked-params} property). A parameter name is considered sensitive
 * when any of its words — split on non-alphanumeric characters and
 * camelCase boundaries — matches a masked name ({@code new_password},
 * {@code cardPin}), or when the name with separators stripped contains one
 * of the high-confidence fragments ({@code confirmpassword},
 * {@code api-key}).</p>
 *
 * @since 3.0.2
 */
public class HttpParams extends LinkedHashMap<String, List<String>>
        implements Loggeable, AuditLogEventConvertible {

    private static final long serialVersionUID = 1L;

    /** Replacement string used for masked values. */
    public static final String MASK = "***";

    private static final Set<String> MASKED_WORDS = Set.of(
      "password", "passwd", "pwd", "pass", "secret", "token",
      "pin", "cvv", "cvc", "cvv2", "otp", "apikey"
    );
    private static final List<String> MASKED_FRAGMENTS = List.of(
      "password", "passwd", "secret", "apikey", "token"
    );

    private final Set<String> extraMasked;

    public HttpParams() {
        this.extraMasked = Set.of();
    }

    /**
     * @param extraMasked additional parameter names to mask, on top of the
     *                    built-in list; matched case-insensitively ignoring
     *                    separators, so {@code security-answer} also masks
     *                    {@code securityAnswer} and {@code old_security_answer}
     */
    public HttpParams(Collection<String> extraMasked) {
        this.extraMasked = normalize(extraMasked);
    }

    /**
     * Copies {@code src} into a masking map using the built-in name list only.
     *
     * @param src parameters to copy
     */
    public HttpParams(Map<String, List<String>> src) {
        this.extraMasked = Set.of();
        putAll(src);
    }

    /**
     * @param name parameter name
     * @return true if this parameter's values are masked in log output
     */
    public boolean isMasked(String name) {
        String stripped = name.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
        for (String fragment : MASKED_FRAGMENTS) {
            if (stripped.contains(fragment))
                return true;
        }
        for (String extra : extraMasked) {
            if (stripped.contains(extra))
                return true;
        }
        for (String word : words(name)) {
            if (MASKED_WORDS.contains(word))
                return true;
        }
        return false;
    }

    /**
     * @return a copy of this map with the values of sensitive parameters
     *         replaced by {@link #MASK} (one mask per value, so multiplicity
     *         remains visible)
     */
    public Map<String, List<String>> maskedView() {
        Map<String, List<String>> out = new LinkedHashMap<>();
        forEach((k, v) -> {
            if (v != null && isMasked(k))
                out.put(k, v.stream().map(s -> MASK).toList());
            else
                out.put(k, v);
        });
        return out;
    }

    @Override
    public void dump(PrintStream p, String indent) {
        String inner = indent + "  ";
        p.println(indent + "<http-params>");
        maskedView().forEach((k, v) -> p.println(inner + k + ": " + v));
        p.println(indent + "</http-params>");
    }

    @Override
    public AuditLogEvent toAuditEvent() {
        return new HttpParamsEvt(maskedView());
    }

    @Override
    public String toString() {
        return maskedView().toString();
    }

    private static Set<String> normalize(Collection<String> names) {
        return names.stream()
          .filter(s -> s != null && !s.isBlank())
          .map(s -> s.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", ""))
          .filter(s -> !s.isEmpty())
          .collect(java.util.stream.Collectors.toUnmodifiableSet());
    }

    private static List<String> words(String name) {
        String split = name
          .replaceAll("(?<=[a-z0-9])(?=[A-Z])", "_")
          .toLowerCase(Locale.ROOT);
        List<String> out = new ArrayList<>();
        for (String w : split.split("[^a-z0-9]+")) {
            if (!w.isEmpty())
                out.add(w);
        }
        return out;
    }
}
