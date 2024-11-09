<script setup>
import img1 from '/src/components/icons/Programar.svg'
import img2 from '/src/components/icons/Reparación.svg'
import img3 from '/src/components/icons/Industria.svg'
import img4 from '/src/components/icons/Español.svg'
import img5 from '/src/components/icons/Ingles.svg'
import img6 from '/src/components/icons/Italiano.svg'
import { ref } from 'vue';
const habilidades = ref([
    {
        id: 1,
        nombre: 'Habilidades Técnicas y de Programación:',
        habilidades: [
          { id: 1, nombre: 'Desarrollo Front-End', icono: img1, nivel: 'Avanzado' },
          { id: 2, nombre: 'Desarrollo Back-End', icono: img1, nivel: 'Intermedio' },
          { id: 3, nombre: 'Manejo de Bases de Datos', icono: img2, nivel: 'Intermedio' },
          { id: 4, nombre: 'Desarrollo de Aplicaciones', icono: img3, nivel: 'Avanzado' }
        ]
      },
      {
        id: 2,
        nombre: 'Idiomas:',
        habilidades: [
          { id: 1, nombre: 'Español', icono: img4, nivel: 'Nativo' },
          { id: 2, nombre: 'Inglés', icono: img5, nivel: 'Básico' }
        ]
      },
      {
        id: 3,
        nombre: 'Otras Habilidades:',
        habilidades: [
          { id: 1, nombre: 'Trabajo en Equipo', icono: img1, nivel: 'Avanzado' },
          { id: 2, nombre: 'Gestión de Proyectos', icono: img2, nivel: 'Intermedio' },
          { id: 3, nombre: 'Creatividad y Resolución de Problemas', icono: img3, nivel: 'Avanzado' }
        ]
      }
]);
</script>
<template>
        <div class="skills-contenedor">
            <div v-for="habilidad in habilidades" :key="habilidad.id" class="skills-categoria">
                <h3>{{ habilidad.nombre }}</h3>
                <ul class="skills">
                    <li v-for="habilidad in habilidad.habilidades" :key="habilidad.id" class="skill">
                        <img :src="habilidad.icono" :alt="habilidad.nombre">
                        <span>{{ habilidad.nombre }}: {{ habilidad.nivel }}</span>
                    </li>
                </ul>
            </div>
        </div>

    <!--<div class="skills-contenedor">
        <div class="skills-categoria">
            <h3>Habilidades Técnicas y de Programación</h3>
            <ul class="skills">
                <li>
                    <img src="/src/components/icons/Juego.svg" alt="Programar">
                    <img src="/src/components/icons/Programar.svg" alt="Programación y Desarrollo">
                    <span>Programación y Desarrollo:  Creación de juegos y aplicaciones simples.  Conocimiento en lenguajes de programación asociados a la Tecnicatura en Programación.
                    </span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/Reparación.svg" alt="Mantenimiento y Reparación">
                    <span>Mantenimiento y Reparación:  Ensamblaje y reparación de PCs.  Diagnóstico y solución de fallas en dispositivos electrónicos y mecánicos.
                    </span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/Industria.svg" alt="Máquinas Industriales y Electricidad">
                    <span>Máquinas Industriales y Electricidad:  Experiencia en el manejo de máquinas industriales.  Conocimientos básicos de electricidad aplicados a la industria y mantenimiento.
                    </span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/Rendimiento.svg" alt="Habilidades Técnicas Adicionales">
                    <span>Habilidades Técnicas Adicionales: Capacidad para reparar y hacer mantenimiento de distintos tipos de dispositivos electrónicos. Ajustar el rendimiento de los equipos de computación.
                    </span>
                </li>
            </ul>
        </div>
    </div>
    <div class="skills-categoria">
        <h3>Idiomas</h3>
        <ul class="skills">
            <li class="skill">
                <img src="/src/components/icons/Español.svg" alt="Español">
                <span>Español: Nativo</span>
            </li> 
            <li class="skill">
                <img src="/src/components/icons/Ingles.svg" alt="Inglés">
                <span>Inglés: Básico</span>
            </li>
            <li class="skill">
                <img src="/src/components/icons/Italiano.svg" alt="Italiano">
                <span>Italiano: Básico</span>
            </li>    
        </ul>
    </div>-->

</template>

<style scoped>
.skills-contenedor {
    padding: 2em;
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    background-color: rgb(28, 41, 52);
    /*background: linear-gradient(-45deg, #021526, #a50101, #01b91a, #0e5292); */
}

.skills.categoria {
    margin-bottom: 20px;
}

.skills-categoria {
    display: flex;
    justify-content: left;
    color:aliceblue;
    font-size: 1.5em;
    font-weight: bold;
    margin-bottom: 10px;
}

.skills {
    display: flex;
    flex-direction: space-evenly;
    flex-wrap: wrap;
    gap: 20px;
}

.skill {
    display: flex;
    justify-content: left;
    background-color: rgba(241, 245, 243, 0.856);
    padding: 0.3em;
    border-radius: 8px;
    box-shadow: opx 4px 12px rgba(2, 151, 151, 0.963);
    flex: 1 1 200px;
    max-width: 250px;
    align-items: center;
    gap: 10px;
}

.skill:hover {
    background-color: rgb(2, 151, 151, 0.963);
}

.skill img {
    width: 35px;
    height: 35px;
}

.skill span {
    font-size: 1rem;
    color: #333;
}

.skill:hover {
    font-size: 1.3rem;
    transition: 2s ease;
}

@media (max-width: 768px) {
    .skills-categoria {
        justify-content: center;
    }

    .skill {
        justify-content: center;
    }
}

</style>