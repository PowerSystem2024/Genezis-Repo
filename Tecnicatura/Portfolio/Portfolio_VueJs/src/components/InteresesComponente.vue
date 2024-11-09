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
        <ul class="contenedor-lista">
            <li class="item" v-for="interes in intereses" :key="interes">
                {{ interes }}
            </li>
        </ul>
    </div>
    <!--<div class="intereses-contenedor">
        <ul class="contenedor-lista">
            <li class="item">
                Desarrollo de Software:
                    Interés por la creación de aplicaciones y juegos, con el objetivo de seguir aprendiendo nuevas tecnologías y lenguajes de programación.
            </li>
            <li class="item">
                Tecnología y Electrónica:
                    Fascinación por la tecnología, con especial énfasis en el ensamblaje y mantenimiento de PCs, así como la reparación de dispositivos electrónicos.
            </li>
            <li class="item">
                Mecánica y Máquinas Industriales:
                    Gusto por el trabajo práctico en talleres, especialmente en el manejo de máquinas industriales y sistemas mecánicos.
            </li>
            <li class="item">
                "Innovación y Creatividad:
                    Enfoque en el desarrollo de soluciones innovadoras, orientadas en la optimización del rendimiento y el mantenimiento eficiente de sistemas, dispositivos y hardware."
            </li>
        </ul>
    </div>-->
</template>

<style scoped>
.intereses-contenedor {
    display: flex;
    position: relative;
    margin: 0 auto;
    max-width: 85%;
    padding: 1rem;
}

.contenedor-lista {
    list-style-type: none;
    padding: 1rem;
    margin-bottom: .5rem;
    color: var(--vt-c-white-soft);
    font-size: 1.4rem;
    text-shadow: 3px 3px 6px rgba(0, 0, 0, 0.1);
}

.item {
    margin-bottom: 1rem;
}


</style>


