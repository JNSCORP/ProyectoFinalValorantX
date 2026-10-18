@echo off
setlocal
cd /d "%~dp0"

set "NATIVE_DIR=%CD%\target\native"

call mvn process-resources
if errorlevel 1 (
    echo Error: Maven no pudo descargar o copiar el DLL de autenticacion de SQL Server.
    exit /b 1
)

if not exist "%NATIVE_DIR%\mssql-jdbc_auth-12.10.1.x64.dll" (
    echo Error: no se encontro mssql-jdbc_auth-12.10.1.x64.dll en "%NATIVE_DIR%".
    exit /b 1
)

call mvn "-Dspring-boot.run.jvmArguments=-Djava.library.path=%NATIVE_DIR%" spring-boot:run
exit /b %errorlevel%
