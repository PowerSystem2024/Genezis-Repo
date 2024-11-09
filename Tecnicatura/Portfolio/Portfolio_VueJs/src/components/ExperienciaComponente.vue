<script setup>
import { ref } from 'vue';
import icono1 from '/src/assets/hammer-and-wrench-svgrepo-com.svg';
import icono2 from '/src/assets/medal-svgrepo-com.svg';
import icono3 from '/src/assets/play-game-svgrepo-com.svg';
import icono4 from '/src/assets/pc-svgrepo-com.svg';
import icono5 from '/src/assets/pc-svgrepo-com.svg';

const titulo = "Experiencia Grupal - Estudiantes de la Tecnicatura en Programación - UTN";
const fecha = "Desde 2022 - Actualmente";
const experiencias = ref([
    {
        id: 1,
        fecha: '2024',
        src: icono1,
        title: 'Proyecto de Aplicación Web - Gestión de Recursos',
        descripcion: 'Desarrollo de una aplicación de gestión de recursos para pequeñas empresas utilizando tecnologías como Vue.js y Node.js. El proyecto se llevó a cabo en equipos y fortaleció la colaboración y habilidades de backend y frontend.'
    },
    {
        id: 2,
        fecha: '2023',
        src: icono2,
        title: 'Desarrollo de Sistema de Reservas para Eventos',
        descripcion: 'Implementación de un sistema de reservas y gestión de eventos en grupo, desde el diseño de la interfaz hasta la integración de bases de datos. El equipo trabajó con SQL y tecnologías frontend para brindar una solución completa.'
    },
    {
        id: 3,
        fecha: '2022',
        src: icono3,
        title: 'Hackathon Universitaria de Programación',
        descripcion: 'Participación en una hackathon universitaria, donde los estudiantes del grupo "Genezis" desarrollaron una aplicación innovadora en 48 horas. Se utilizaron técnicas de trabajo ágil y se promovió el aprendizaje en condiciones de alta presión.'
    },
    {
        id: 4,
        fecha: '2022',
        src: icono4,
        title: 'Proyecto de E-commerce - Curso Avanzado de Programación',
        descripcion: 'Creación de una plataforma de e-commerce como parte de un proyecto final de curso. La experiencia permitió a los estudiantes de Genezis mejorar sus habilidades en JavaScript, HTML, CSS y bases de datos.'
    },
    {
        id: 5,
        fecha: '2021',
        src: icono5,
        title: 'Práctica Profesional Supervisada - Desarrollo Full Stack',
        descripcion: 'Realización de prácticas supervisadas en desarrollo full stack en colaboración con empresas locales. El equipo participó en todas las fases de desarrollo de aplicaciones web, incluyendo planificación, desarrollo y pruebas.'
    }
]);
</script>

<template>
  <div class="card">
    <h3 class="titulo">{{ titulo.toUpperCase() }}</h3>
    <p class="fecha">{{ fecha }}</p>
    <ul class="listado">
      <li class="item" v-for="experiencia in experiencias" :key="experiencia.id">
        <img class="imagen" :src="experiencia.src" width="45rem" :alt="experiencia.title" />
        <div>
          <h4>{{ experiencia.title }}</h4>
          <p>{{ experiencia.descripcion }}</p>
        </div>
      </li>
    </ul>
  </div>
</template>

<style scoped>
.card {
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding: 2rem;
  border-radius: 15px;
  background-color: rgb(28, 41, 52);
  color: #ffffff;
}

.titulo {
  font-size: 2rem;
  text-align: center;
}

.fecha {
  font-size: 1.5rem;
  text-align: center;
}

.listado {
  list-style: none;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin: 2rem;
  padding: 0;
}

.item {
  display: flex;
  align-items: flex-start;
  padding: 1rem;
  gap: 1.5rem;
  width: 100%;
  background-color: #2d3e50;
  border-radius: 8px;
  margin-bottom: 1rem;
}

.imagen {
  border-radius: 8px;
}

.item h4 {
  font-size: 1.2rem;
  margin: 0;
  color: #fff;
}

.item p {
  margin: 0.5rem 0 0;
  color: #c0c0c0;
}
</style>
