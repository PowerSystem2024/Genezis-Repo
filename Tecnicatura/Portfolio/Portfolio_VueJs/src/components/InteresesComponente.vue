<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';

const intereses = ref([
  'Desarrollo de Software: Interés grupal por la creación de aplicaciones web, móviles y de escritorio, con un enfoque en el aprendizaje y aplicación de tecnologías modernas como JavaScript, Vue.js y frameworks relacionados.',
  'Programación Colaborativa: Valoramos el trabajo en equipo para desarrollar proyectos de software en conjunto, compartiendo conocimientos y contribuyendo al desarrollo de aplicaciones escalables y eficientes.',
  'Desarrollo de Juegos: Interés en la creación de videojuegos, explorando motores como Unity o Godot, y aplicando técnicas de programación para crear experiencias interactivas y educativas.',
  'Inteligencia Artificial y Machine Learning: Fascinación por la IA, el aprendizaje automático y la automatización de procesos, buscando soluciones innovadoras para aplicaciones de software y sistemas inteligentes.',
  'Tecnologías Emergentes: Exploración de nuevas tecnologías en programación, como blockchain, IoT (Internet of Things) y realidad aumentada (AR), con el objetivo de estar a la vanguardia del desarrollo tecnológico.',
  'Metodologías Ágiles: Enfoque en la implementación de metodologías ágiles como Scrum y Kanban para gestionar proyectos de desarrollo software, promoviendo la eficiencia y la colaboración dentro del equipo.',
]);
</script>

<template>
  <div class="intereses-contenedor">
    <FondoLava />
    <div class="contenido-intereses">
      <h2>Áreas de Interés</h2>
      <ul class="contenedor-lista">
        <li class="item" v-for="interes in intereses" :key="interes">
          {{ interes }}
        </li>
      </ul>
    </div>
  </div>
</template>

<style scoped>
.intereses-contenedor {
  display: flex;
  position: relative;
  margin: 0 auto;
  max-width: 85%;
  padding: 2rem;
  background: linear-gradient(135deg, rgba(34, 193, 195, 1) 0%, rgba(253, 187, 45, 1) 100%);
  border-radius: 10px;
}

.contenedor-lista {
  list-style-type: none;
  padding: 1rem;
  margin-bottom: .5rem;
  color: #fff;
  font-size: 1.4rem;
  text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.3);
}

.item {
  margin-bottom: 1.5rem;
  background: rgba(0, 0, 0, 0.6);
  padding: 10px;
  border-radius: 8px;
  transition: transform 0.3s ease;
}

.item:hover {
  transform: scale(1.05);
  background: rgba(0, 0, 0, 0.8);
}

.contenido-intereses {
  z-index: 2;
  padding: 1.5rem;
  width: 100%;
}

h2 {
  color: #fff;
  text-align: center;
  font-size: 2.5rem;
  margin-bottom: 1.5rem;
  text-shadow: 3px 3px 6px rgba(0, 0, 0, 0.5);
}
</style>



