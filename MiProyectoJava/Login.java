public class Login {
    public boolean autenticar(String usuario, String contraseña) {
        return usuario.equals("admin") && contraseña.equals("1234");
    }
}

// Cambio en feature