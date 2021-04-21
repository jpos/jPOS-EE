package org.jpos.qi.minigl;

import org.jpos.qi.QIHelper;

public class CompositeAccountsView extends AccountsView {
    @Override
    public QIHelper createHelper() {
        return new AccountsHelper(true, loadMaxLevelFromConfig());
    }

}
