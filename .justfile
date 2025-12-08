publish:
    gradle clean publishToMavenLocal --rerun-tasks --refresh-dependencies

libs:
    vi gradle/libs.versions.toml

testlibs:
    vi gradle/testlibs.versions.toml

clean:
    gradle clean

[no-cd]
lint:
    gradle -Plint --warning-mode all jar clean jar

resetdb:
    @echo "DROP DATABASE jposee; CREATE DATABASE jposee" | psql postgres

[no-cd]
run:
    gradle iA && q2
