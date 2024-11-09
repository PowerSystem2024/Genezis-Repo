<script setup>
import img1 from '/src/components/icons/Programar.svg';
import img2 from '/src/components/icons/base_de_datos.svg';
import img3 from '/src/components/icons/grupo.svg';
import img4 from '/src/components/icons/desarrollo_de_aplicaciones.svg';
import img5 from '/src/components/icons/gestion_de_proyectos.svg';
import img6 from '/src/components/icons/creatividad.svg';
import img7 from '/src/components/icons/backend.svg';


import { ref } from 'vue';

const habilidades = ref([
    {
        id: 1,
        nombre: 'Habilidades Técnicas y de Programación',
        habilidades: [
          { id: 1, nombre: 'Desarrollo Front-End', icono: img1, nivel: 'Avanzado' },
          { id: 2, nombre: 'Desarrollo Back-End', icono: img7, nivel: 'Intermedio' },
          { id: 3, nombre: 'Manejo de Bases de Datos', icono: img2, nivel: 'Intermedio' },
          { id: 4, nombre: 'Desarrollo de Aplicaciones', icono: img4, nivel: 'Avanzado' }
        ]
      },
      
      {
        id: 2,
        nombre: 'Otras Habilidades',
        habilidades: [
          { id: 1, nombre: 'Trabajo en Equipo', icono: img3, nivel: 'Avanzado' },
          { id: 2, nombre: 'Gestión de Proyectos', icono: img5, nivel: 'Intermedio' },
          { id: 3, nombre: 'Creatividad y Resolución de Problemas', icono: img6, nivel: 'Avanzado' }
        ]
      }
]);
</script>

<template>
    <div class="skills-container">
        <div v-for="categoria in habilidades" :key="categoria.id" class="skills-category">
            <h3>{{ categoria.nombre }}</h3>
            <div class="skills-list">
                <div v-for="skill in categoria.habilidades" :key="skill.id" class="skill-card">
                    <img :src="skill.icono" :alt="skill.nombre" class="skill-icon">
                    <div class="skill-info">
                        <span class="skill-name">{{ skill.nombre }}</span>
                        <span class="skill-level">{{ skill.nivel }}</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<style scoped>
.skills-container {
    padding: 2em;
    background-color: rgb(28, 41, 52);
}

.skills-category {
    margin-bottom: 2rem;
    color: #e0f7fa;
    text-align: center;
}

.skills-category h3 {
    font-size: 1.8rem;
    margin-bottom: 1rem;
    color: #80cbc4;
}

.skills-list {
    display: flex;
    flex-wrap: wrap;
    gap: 1.5rem;
    justify-content: center;
}

.skill-card {
    background-color: rgba(241, 245, 243, 0.856);
    padding: 1rem;
    border-radius: 12px;
    display: flex;
    align-items: center;
    width: 250px;
    box-shadow: 0 4px 12px rgba(2, 151, 151, 0.5);
    transition: transform 0.2s;
}

.skill-card:hover {
    transform: scale(1.05);
    background-color: rgba(2, 151, 151, 0.9);
}

.skill-icon {
    width: 50px;
    height: 50px;
    margin-right: 1rem;
}

.skill-info {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
}

.skill-name {
    font-size: 1.2rem;
    font-weight: bold;
    color: #333;
}

.skill-level {
    font-size: 1rem;
    color: #666;
}

@media (max-width: 768px) {
    .skills-category h3 {
        font-size: 1.5rem;
    }

    .skill-card {
        width: 100%;
        justify-content: center;
    }
}
</style>

