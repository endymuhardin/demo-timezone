# Aplikasi Demo Timezone #

Setup Database

1. Instal database MySQL

    ```
    apt install mysql-server -y
    ```

2. Login sebagai root

    ```
    mysql
    ```

3. Create database

    ```
    create database `demo-timezone`;
    ```

4. Create user untuk mengakses database

   ```
   create user demo@localhost identified by 'timezone';
   ```

5. Grant permission user ke database

    ```
    grant all on `demo-timezone`.* to demo@localhost;
    ```

6. Quit sebagai root

    ```
    \q
    ```

7. Test login dengan user yang baru dibuat

    ```
    mysql -h 127.0.0.1 -u demo -p demo-timezone
    ```

## Set Timezone di JVM ##

* Menggunakan opsi command line

    ```
    java -Duser.timezone="Asia/Jakarta" -jar target/*jar
    ```

##