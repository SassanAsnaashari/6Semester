cmake_minimum_required(VERSION 3.21)
project(Aufgabe2 C)

set(CMAKE_C_STANDARD 11)

include_directories(..)

add_executable(Aufgabe2
        rdbase.c
        rdbase.h
        rdbase_cif.c
        rdbase_clnt.c
        rdbase_sif.c
        rdbase_srp.c
        rdbase_svc.c
        rdbase_xdr.c)
