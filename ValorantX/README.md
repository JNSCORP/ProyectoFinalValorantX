# VALORANTX

Aplicación web de registro e inicio de sesión con React, Java Spring Boot y SQL Server, organizada estrictamente por capas.

## Capas
- PRESENTATION: Controllers y DTOs
- BUSINESS: Services y validaciones
- DATA: Entities y Repositories
- FRONTEND: React/Vite
- DATABASE: SQL Server

## Requisitos
JDK 17+, Maven, Node.js, SQL Server y Visual Studio Code.

## Base de datos
Ejecuta `database/valorantx.sql` en SQL Server Management Studio.
El backend usa autenticación integrada de Windows; el usuario de Windows que inicia la aplicación debe tener acceso a la base `ValorantX`.

## Backend
```cmd
cd backend/valorantx-api
.\run-backend.cmd
```
En Windows, `run-backend.cmd` descarga el DLL nativo oficial de Microsoft mediante Maven y configura `java.library.path` antes de iniciar Spring Boot. Requiere Maven disponible en `PATH` y una JVM x64 para el DLL x64.
http://localhost:8080

## Frontend
```bash
cd frontend/valorantx-react
npm install
npm run dev
```
http://localhost:5173

Las contraseñas se almacenan usando BCrypt.
