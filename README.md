# Katalon example Employees MySQL database

## Description

Project Katalon ini dimaksudkan sebagai contoh pengaksesan database MySQL dari Katalon.

Silahkan untuk langsung dilihat pada halaman groovy tiap test case untuk melihat contoh scriptingnya.

### Filename's Prefix

Berikut ini adalah arti dari singkatan-singtakan yang dituliskan pada nama file:

SC = Scenario
TC = Test Case

## Requirements

1. Katalon Studio or Katalon Runtime Engine

2. MySQL Connector

    From inside project folder, run this gradle command to download MySQL Connector into Drivers folder

    ```powershell
    gradle.bat copyLibs
    ```

3. A MySQL Server serving `employees` database from datacharmer / test_db  <https://github.com/datacharmer/test_db>

## Docker Compose

Jika terbiasa menggunakan docker, database bisa disiapkan dengan memanfaatkan, Katalon example Employees MySQL database - Docker Compose pada <https://github.com/indraginanjar/katalon-example-employees-mysql-database-docker-compose>

## Asumption

Database `employees` sama persis dengan versi originalnya saat Katalon test dijalankan.

## Layout

Test Cases:
    Pengelompokkan (nama test suite atau nama lainnya):
        - SC - Scenario 1
        - SC - Scenario 2
        - ...
        - ...
        Scenario 1 (folder):
            - TC - Testcase 1 untuk scenario 1
            - TC - Testcase 2 untuk scenario 1
            - ...
            - ...
        Scenario 2 (folder):
            - TC - Testcase 1 untuk scenario 2
            - TC - Testcase 2 untuk scenario 2
            - ...
            - ...
Test Suites:
    - TS - Pengelompokkan
Data Files:
    Pengelompokkan:
        - Scenario 1 (internal test data)
        - Scenario 2 (internal test data)

## Data Binding

Data binding dilakukan pada halaman Test Suite, karena pada Katalon Standalone (Community) edition data binding tidak bisa dilakukan pada test case.
