package com.valorantx.business.service;
import com.valorantx.presentation.dto.*;
public interface UsuarioService { String registrar(RegistroRequest request); boolean iniciarSesion(LoginRequest request); }
