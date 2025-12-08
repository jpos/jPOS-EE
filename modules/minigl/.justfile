

testp:
   gradle -Dtest.minigl_db_driver=postgres clean test --rerun-tasks --info


testl:
   gradle -Dtest.minigl_db_driver=local clean test --rerun-tasks --info

