<script setup>
import icono1 from '/src/assets/hammer-and-wrench-svgrepo-com.svg'
import icono2 from '/src/assets/medal-svgrepo-com.svg'
import icono3 from '/src/assets/play-game-svgrepo-com.svg'
import icono4 from '/src/assets/pc-svgrepo-com.svg'

import { ref } from 'vue';
const titulo="Desarrollador, Técnico en Electrónica y Mantenimiento";
const fecha="Desde 2019 - Hasta 2024";
const experiencias = ref([
    {id:1, src: icono1, parrafo:"Taller y Máquinas Industriales: Tengo experiencia en el manejo de máquinas industriales y trabajos relacionados con electricidad, lo cual me ha permitido adquirir habilidades técnicas fundamentales."},
    {id:2, src: icono2, parrafo:"Arreglos Electrónicos y Mecánicos: Tengo conocimientos en arreglos de dispositivos electrónicos y mecánicos, lo que me ha brindado una visión amplia sobre el funcionamiento de distintos sistemas."},
    {id:3, src: icono3, parrafo:"Proyectos de Juegos: He creado proyectos de juegos, explorando el mundo del desarrollo de software y la creatividad."},
    {id:4, src: icono4, parrafo:"Ensamblaje y Reparación de PCs: También tengo experiencia en el ensamblaje y reparación de PCs, comprendo el hardware y las configuraciones necesarias para optimizar el rendimiento de los equipos."}
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{titulo.toLocaleUpperCase()}}</h3>
        <p class="fecha">{{fecha}}</p>
        <ul class="listado">
            <li class="item" v-for="experiencia in experiencias" :key="experiencia.id">
                <img class="imagen.svg" :src="experiencia.src" width="45rem" alt="experiencia.parrafo">
                <p>{{experiencia.parrafo}}</p>
            </li>
            <!--<li class="item"><img class="imagen.svg" src="/src/assets/hammer-and-wrench-svgrepo-com.svg" width="45rem" alt="">
                <p>Taller y Máquinas Industriales:
                    Tengo experiencia en el manejo de máquinas industriales y trabajos relacionados con electricidad, lo cual me ha permitido adquirir habilidades técnicas fundamentales.</p>
            </li>
            <li class="item"><img class="imagen.svg" src="/src/assets/medal-svgrepo-com.svg" width="45rem" alt="">
                <p>Arreglos Electrónicos y Mecánicos:
                    Tengo conocimientos en arreglos de dispositivos electrónicos y mecánicos, lo que me ha brindado una visión amplia sobre el funcionamiento de distintos sistemas.</p>
            </li>
            <li class="item"><img class="imagen.svg" src="/src/assets/play-game-svgrepo-com.svg" width="45rem" alt="">
                <p>Proyectos de Juegos:
                    He creado proyectos de juegos, explorando el mundo del desarrollo de software y la creatividad.</p>
            </li>
            <li class="item"><img class="imagen.svg" src="/src/assets/pc-svgrepo-com.svg" width="45rem" alt="">
                <p>Ensamblaje y Reparación de PCs:
                    También tengo experiencia en el ensamblaje y reparación de PCs, comprendo el hardware y las configuraciones necesarias para optimizar el rendimiento de los equipos.</p>
            </li> -->
        </ul>
    </div>
</template>

<style scoped>
.card{
    display: flex;
    flex-direction: column;
    justify-content: center;
    padding: 2rem;
    border-radius: 15px;
    background-color: rgb(28, 41, 52);
    
}
.titulo{
    font-size: 2rem;
    text-align: center;
}
.fecha{
    font-size: 1.5rem;
    text-align: center;
}
.listado{
    list-style: none;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    margin: 2rem;
}
.item{
    display: flex;
    align-items: center;
    padding: 1rem;
    gap: 1.5rem;
}
</style>











