# Setup instructions

QI is preconfigured to support either MySQL or Postgresql.

Please review `devel.properties` which looks like this:

```
dbhost=localhost
dbname=qi_dev
dbuser=jpos
dbpass=password
```

and properly set `dbhost`, `dbname`, `dbuser` and `dbpass`.

If you want to use Postgresql instead of MySQL, edit 
`src/dist/cfg/db.properties`, comment out MySQL configuration and enable Postgresql's.

Build the system using `gradle installApp` and run `build/install/testbed/bin/q2 --cli`

(you can also call `gradle dist` and expand your `build/distributions/testbed-x.x.x.tar.gz) elsewhere and run `bin/q2 --cli`.


Once you get the `q2>` prompt, try:


```
createschema - true
addrole admin login sysadmin sysconfig users.read users.write
addrole test login sysadmin sysconfig users.read users.write
adduser admin -ptest -radmin -rtest -n"System Administrator"
sysconfig
add sys.REMEMBER_PASSWORD_ENABLED true
add sys.MAX_LOGIN_ATTEMPTS 5
add sys.PASSWORD_AGE 90
add perm.login "Can log into the system"
add perm.sysadmin "Has administrator privileges"
add perm.users.read "Has read access to system's users information"
add perm.users.write "Can administer system's users"
exit

shutdown
```
At this point you should be able to start Q2 again without the `--cli` argument and log into [locahost:8080](http://localhost:8080) using user `admin` and password `test`. 

You can check `log/q2.log` in the `build/install/testbed` directory.

