package com.valorantx.presentation.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return """
                <!doctype html>
                <html lang="es">
                <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>VALORANTX API</title>
                    <style>
                        body { font-family: system-ui, sans-serif; margin: 3rem auto; max-width: 42rem; padding: 0 1rem; color: #202124; }
                        h1 { color: #e53935; }
                        code { background: #f1f3f4; border-radius: .25rem; padding: .15rem .35rem; }
                        li { margin: .75rem 0; }
                    </style>
                </head>
                <body>
                    <h1>VALORANTX API</h1>
                    <p>La API está activa.</p>
                    <h2>Rutas disponibles</h2>
                    <ul>
                        <li><code>POST /api/usuarios/registro</code> — registrar usuario</li>
                        <li><code>POST /api/usuarios/login</code> — iniciar sesión</li>
                    </ul>
                </body>
                </html>
                """;
    }
}
