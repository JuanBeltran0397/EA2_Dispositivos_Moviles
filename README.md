# App HolaIUDigital 📱
Proyecto desarrollado para la IU Digital de Antioquia. Consiste en una aplicación nativa de Android escrita en Java que implementa conceptos de diseño adaptativo, transferencia de datos entre actividades y gestión del estado ante cambios de orientación.

🚀 __Funcionalidades Principales__ 

__Paso de datos bidireccional:__ Envía mensajes entre pantallas mediante Intent y ActivityResultLauncher, permitiendo retornar estados de confirmación (Recibido o Cancelado).

__Diseño adaptativo:__ Implementa ScrollView para evitar que los elementos de la interfaz se corten al cambiar a modo horizontal o en pantallas reducidas.

__Estilo visual:__ Utiliza componentes de Material Design y tarjetas translúcidas (CardView) con efecto glassmorphism sobre fondos personalizados con los logos de la institución.

__Persistencia en rotación:__ Manejo de la configuración en el AndroidManifest.xml mediante configChanges para evitar el reinicio de la actividad y preservar la información en pantalla al girar el dispositivo.

__Control de cierre:__ Incluye una opción explícita para finalizar la ejecución de la app utilizando el método finish().

🛠️ __Tecnologías Utilizadas__

__Lenguaje:__ Java ☕

__Interfaz de usuario:__ XML con Material Design

__Entorno de desarrollo:__ Android Studio

__Control de versiones:__ GitHub

💻 __Ejecución del Proyecto__

1. Clonar el repositorio:

Bash

git clone https://github.com/TU_USUARIO/TU_REPOSITORIO.git

2. Abrir el proyecto desde Android Studio.

3. Sincronizar las dependencias de Gradle y ejecutar el proyecto en un emulador o dispositivo físico mediante el botón Play (▶).

✍️ __Desarrollado por:__ 

* JUAN FERNANDO BELTRAN LOPEZ
* JHOJANTH CAMILO ALEGRIA ESCOBAR
  
Estudiantes de la IU Digital de Antioquia
