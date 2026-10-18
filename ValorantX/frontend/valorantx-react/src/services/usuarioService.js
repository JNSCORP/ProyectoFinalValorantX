const API='http://localhost:8080/api/usuarios';
export async function registrarUsuario(datos){const r=await fetch(`${API}/registro`,{method:'POST',headers:{'Content-Type':'application/json'},body:JSON.stringify(datos)});const d=await r.json();if(!r.ok)throw Error(d.mensaje||'Error de registro');return d}
export async function iniciarSesion(datos){const r=await fetch(`${API}/login`,{method:'POST',headers:{'Content-Type':'application/json'},body:JSON.stringify(datos)});const d=await r.json();if(!r.ok)throw Error(d.mensaje||'Error de autenticación');return d}
