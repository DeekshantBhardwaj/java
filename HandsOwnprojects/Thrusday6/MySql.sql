#####Write  a programme in sql to perform the inner join left join and full join in am databse.....
Author=Deekshant Bhardwaj
Date=09/11/2022
#######







mysql> show databases;                   ######  Now here we can create a database name ___house__________#######
+--------------------+
| Database           |
+--------------------+
| empdb              |
| homedb             |
| house              |              ------------>here the present our datavse
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
7 rows in set (0.00 sec)

mysql> use home;
ERROR 1049 (42000): Unknown database 'home'
mysql> use homedb;
Database changed
mysql> show tables;
Empty set (0.00 sec)

mysql> select * from home2;
ERROR 1146 (42S02): Table 'homedb.home2' doesn't exist
mysql> use house;                                       --------the programmes start from here using housen database----------
Database changed
mysql> show tables;        ---command use (show) to see the tables in a datbase----
+-----------------+
| Tables_in_house |
+-----------------+
| home            |
| home2           |
| house_memeber   |
+-----------------+
3 rows in set (0.00 sec)

mysql> select * from home2;                                  -----now we have run a Query which we can see the data in the the table----------
+--------+----------+--------------+--------+
| mem_id | habits   | marry        | equity |
+--------+----------+--------------+--------+
|      1 | drawing  | sinngle      |     20 |
|      2 | skecting | mingle       |     30 |
|      3 | running  | not clear    |     56 |
|      4 | jumping  | not possible |      5 |
+--------+----------+--------------+--------+
4 rows in set (0.00 sec)

mysql> select * from home;                                         ------Query for another table----------
+-----------+------+-------------+------+
| id_number | name | gender      | age  |
+-----------+------+-------------+------+
|         1 |   22 | Male        | 22   |
|         2 |   18 | female      | 20   |
|         3 |   21 | transgender | 23   |
+-----------+------+-------------+------+
3 rows in set (0.00 sec)
                                    ######-----------now we have [erform our first join called as inner join which also knoe as inertsection of two sets------------###########
mysql> select home.name,home.gender,home.age,home2.habits,home2.marry,home2.equity from home inner join home2 on id_number=mem_id;      
+------+-------------+------+----------+-----------+--------+
| name | gender      | age  | habits   | marry     | equity |
+------+-------------+------+----------+-----------+--------+
|   22 | Male        | 22   | drawing  | sinngle   |     20 |
|   18 | female      | 20   | skecting | mingle    |     30 |
|   21 | transgender | 23   | running  | not clear |     56 |
+------+-------------+------+----------+-----------+--------+
3 rows in set (0.00 sec)
                                   ######-----------now we have perform our Second join called as left join in this the table from the two sets comsiders as a left side of the table------------###########
mysql> select home.name,home.gender,home.age,home2.habits,home2.marry,home2.equity from home left join home2 on id_number=mem_id;   
+------+-------------+------+----------+-----------+--------+
| name | gender      | age  | habits   | marry     | equity |
+------+-------------+------+----------+-----------+--------+
|   22 | Male        | 22   | drawing  | sinngle   |     20 |
|   18 | female      | 20   | skecting | mingle    |     30 |
|   21 | transgender | 23   | running  | not clear |     56 |
+------+-------------+------+----------+-----------+--------+
3 rows in set (0.00 sec)

mysql> select home.gender,home2.marry from home left join home2 on id_number=mem_id;
+-------------+-----------+
| gender      | marry     |
+-------------+-----------+
| Male        | sinngle   |
| female      | mingle    |
| transgender | not clear |
+-------------+-----------+
3 rows in set (0.00 sec)

mysql> select home.gender,home2.marry from home right join home2 on id_number=mem_id;
+-------------+--------------+
| gender      | marry        |
+-------------+--------------+
| Male        | sinngle      |
| female      | mingle       |
| transgender | not clear    |
| NULL        | not possible |
+-------------+--------------+
4 rows in set (0.00 sec)

mysql> select home.name,home.gender,home.age,home2.habits,home2.marry,home2.equity from home full join home2 on id_number=mem_id;
ERROR 1054 (42S22): Unknown column 'home.name' in 'field list' 



***************** this error is because of the on condition is not working in shell of my sql*******************************




mysql> select home.name,home.gender,home.age,home2.habits,home2.marry,home2.equity from home full join home2 on id_number=mem_id;
ERROR 1054 (42S22): Unknown column 'home.name' in 'field list'
mysql> select * from home2 full join home;             ---------------------------------here we can perform our full join function which is also calles as **onetomany** functions in sets 
+--------+----------+--------------+--------+-----------+------+-------------+------+
| mem_id | habits   | marry        | equity | id_number | name | gender      | age  |
+--------+----------+--------------+--------+-----------+------+-------------+------+
|      1 | drawing  | sinngle      |     20 |         3 |   21 | transgender | 23   |
|      1 | drawing  | sinngle      |     20 |         2 |   18 | female      | 20   |
|      1 | drawing  | sinngle      |     20 |         1 |   22 | Male        | 22   |
|      2 | skecting | mingle       |     30 |         3 |   21 | transgender | 23   |
|      2 | skecting | mingle       |     30 |         2 |   18 | female      | 20   |
|      2 | skecting | mingle       |     30 |         1 |   22 | Male        | 22   |
|      3 | running  | not clear    |     56 |         3 |   21 | transgender | 23   |
|      3 | running  | not clear    |     56 |         2 |   18 | female      | 20   |
|      3 | running  | not clear    |     56 |         1 |   22 | Male        | 22   |
|      4 | jumping  | not possible |      5 |         3 |   21 | transgender | 23   |
|      4 | jumping  | not possible |      5 |         2 |   18 | female      | 20   |
|      4 | jumping  | not possible |      5 |         1 |   22 | Male        | 22   |
+--------+----------+--------------+--------+-----------+------+-------------+------+
12 rows in set (0.00 sec)
