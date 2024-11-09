<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import Educacion from './components/EducacionComponente.vue';
import ExperienciaComponente from './components/ExperienciaComponente.vue';
import ProyectosComponente from './components/ProyectosComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
import InteresesComponente from './components/InteresesComponente.vue';
</script>

<template>
  <header id="top">
    <!-- Barra de Navegación -->
    <NavBar />
    <!-- Datos Personales -->
    <DatosPersonales />
  </header>

  <main>
    <!-- Sección de Educación - Cursos -->
    <section id="educacion">
      <h2>Educación - Cursos</h2>
      <!-- Componente Educación -->
      <Educacion />
    </section>

    <!-- Sección de Experiencia -->
    <section id="experiencia">
      <h2>Experiencia</h2>
      <!-- Componente Experiencia -->
      <ExperienciaComponente />
    </section>

    <!-- Sección de Proyectos -->
    <section id="proyectos">
      <h2>Proyectos</h2>
      <!-- Componente Proyectos -->
      <ProyectosComponente />
    </section>

    <!-- Sección de Habilidades -->
    <section id="habilidades">
      <h2>Habilidades</h2>
      <!-- Componente Habilidades -->
      <HabilidadesComponente />
    </section>

    <!-- Sección de Intereses -->
    <section id="intereses">
      <h2>Intereses</h2>
      <!-- Componente Intereses -->
      <InteresesComponente />
    </section>
  </main>

  <footer>
    <a href="#top">Inicio</a>
    <p>© 2024 Genezis - Portafolio Grupal de Estudiantes - UTN FRSR</p>
  </footer>
</template>

<style scoped>
/* Asegura que el header y el main tengan el mismo centrado */
header, main {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 2rem;
}

section {
  width: 80%; /* Ajusta el ancho de cada sección */
  max-width: 1000px; /* Evita que se estire demasiado */
  margin-bottom: 3rem; /* Espacio entre secciones */
  text-align: center; /* Centra el contenido dentro de la sección */
}

section h2 {
  font-size: 2rem;
  color: #ffffff;
  margin-bottom: 1.5rem;
}

footer {
  color: black;
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 2rem;
  font-size: 1.3rem;
}

footer a {
  text-decoration: none;
  color: #31aa12;
  margin-bottom: 1rem;
  font-weight: bold;
}

footer a:hover {
  text-decoration: underline;
}

footer p {
  font-size: 1rem;
  color: #666;
  text-align: center;
  margin-top: 0.5rem;
}
</style>


