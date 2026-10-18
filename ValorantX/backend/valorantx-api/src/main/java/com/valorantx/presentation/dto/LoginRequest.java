package com.valorantx.presentation.dto;
import jakarta.validation.constraints.NotBlank;
public record LoginRequest(@NotBlank String nombreUsuario,@NotBlank String contrasena){}
