#!/usr/bin/env bash
set -e

psql -v ON_ERROR_STOP=1 --username postgres --dbname postgres <<-EOSQL

    ALTER ROLE postgres WITH ENCRYPTED PASSWORD '111';

    CREATE USER bergen WITH ENCRYPTED PASSWORD '111';
    CREATE DATABASE sample WITH OWNER bergen;
    GRANT ALL ON DATABASE sample TO bergen;

EOSQL
