<script setup>
import proyecto1 from '/src/assets/Fotoportafolio.jpg'
import proyecto2 from '/src/assets/gg.jpg'
import { ref } from 'vue';
var misProyectos = ref([]);
misProyectos.value = ([
    {
        id: 1,
        src: proyecto1,
        titulo: "Genezis Portfolio",
        descripcion: "Desarrollo colaborativo de un portafolio web grupal, integrando Vue.js para presentar proyectos individuales y colectivos de estudiantes de programación.",
        proyectoLink: "https://proyecto.genezis/portfolio",
        githubLink: "https://github.com/GenezisTeam/Portfolio"
    },
    {
        id: 2,
        src: proyecto2,
        titulo: "Sistema de Gestión de Recursos Académicos",
        descripcion: "Proyecto en equipo para crear una plataforma de gestión de recursos académicos, facilitando la organización de materiales y eventos estudiantiles.",
        proyectoLink: "https://proyecto.genezis/gestion-academica",
        githubLink: "https://github.com/GenezisTeam/RecursosAcademicos"
    },
]);

</script>

<template>
    <div class="galeria">
        
        <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
            <img :src="proyecto.src" :alt="proyecto.titulo">
            <div class="Proyecto-info">
                <h3>{{ proyecto.titulo }}</h3>
                <p> {{ proyecto.descripcion }}</p>
                <div class="proyecto-links">
                    <a :href="proyecto.proyectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver 
                        Proyecto</a>
                    <a :href="proyecto.githubLink" class="github-link" target="_blank" 
                        rel="noopener noreferrer">Ver Código en Github</a>
                </div>
            </div>
        </li>
    </div>
</template>

<style scoped>
/* .galeria {
    width: 100%;
    height: 100vh;
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    gap: 20px;
    background-image: url('/src/assets/Kerfin7-NEA-2262.jpg');
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
} */

.galeria {
    display: flex;
    width: 100%;
    height: 100%;
    flex-wrap: wrap;
    justify-content: center;
    gap: 20px;
    padding: 20px;
    background: linear-gradient(-45deg, #947e7e, #023186, #c20f02, #06e911);
    background-size: 400% 400%;
    animation: gradient 15s ease infinite;
}

@keyframes gradient {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}

.proyecto {
    display: flex;
    flex-direction: column;
    text-align: center;
    border: 2px solid #31aa12;
    border-radius: 8px;
    overflow: hidden;
    background-color: #0a0a0a;
    max-width: 222px;
    flex: 1 1 300px;
}

.proyecto img {
    width: 100%;
    height: auto;
    display: block;
}

.proyecto-info {
    padding: 15px;
    text-align: center;
}

.proyecto-info h3 {
    margin: 10px 0; 
    font-size: 1.3em;
    color: #e6dfdf;
}

.proyecto-info p {
    margin: 10px 0; 
    font-size: 1em;
    color: #cc1f1f;
}

.proyecto-links {
    display: flex;
    flex-direction: column;
    gap: 10px;
    margin-top: 10px;
}
</style>
