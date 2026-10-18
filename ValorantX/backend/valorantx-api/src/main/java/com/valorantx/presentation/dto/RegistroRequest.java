package com.valorantx.presentation.dto;
import jakarta.validation.constraints.*;
public record RegistroRequest(@NotBlank @Size(min=3,max=50) String nombreUsuario,@NotBlank @Email String correo,@NotBlank @Size(min=6,max=100) String contrasena){}
