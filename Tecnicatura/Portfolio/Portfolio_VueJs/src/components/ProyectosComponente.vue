<script setup>
import { ref } from 'vue';

import proyecto1 from '/src/assets/proyecto1.jpeg';
import proyecto2 from '/src/assets/proyecto2.jpeg';
import proyecto3 from '/src/assets/proyecto3.jpeg';

const proyectos = ref([
    {
        id: 1,
        src: proyecto1,
        titulo: "Sistema de Gestión de Estudiantes",
        descripcion: "Aplicación web en Java y Spring Boot creada para gestionar estudiantes, cursos y sus calificaciones académicas.",
        ano: "(2023)",
        proyectoLink: "https://www.example.com",
        githubLink: "https://github.com/usuario/sistema-gestion-estudiantes"
    },
    {
        id: 2,
        src: proyecto2,
        titulo: "Aplicación de E-commerce",
        descripcion: "Proyecto de e-commerce desarrollado con React y Node.js, que permite la compra de materiales de estudio y libros técnicos.",
        ano: "(2022)",
        proyectoLink: "https://www.example.com",
        githubLink: "https://github.com/usuario/ecommerce-educativo"
    },
    {
        id: 3,
        src: proyecto3,
        titulo: "Plataforma de Foros para Programadores",
        descripcion: "Foro en línea con PHP y MySQL para estudiantes de programación, con funcionalidades de creación de temas, respuestas y moderación.",
        ano: "(2022)",
        proyectoLink: "https://www.example.com",
        githubLink: "https://github.com/usuario/foro-programacion"
    },
]);
</script>

<template>
    <div class="galeria">
        <ul>
            <li class="proyecto" v-for="proyecto in proyectos" :key="proyecto.id">
                <img :src="proyecto.src" :alt="proyecto.titulo" />
                <div class="proyecto-info">
                    <h3>{{ proyecto.titulo }} <span>{{ proyecto.ano }}</span></h3>
                    <p>{{ proyecto.descripcion }}</p>
                    <div class="proyecto-links">
                         <a :href="proyecto.githubLink" target="_blank" rel="noopener noreferrer" class="btn-ver-mas">Ver en GitHub</a>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</template>

<style scoped>
.galeria {
    display: flex;
    justify-content: center;
    padding: 20px;
    background: linear-gradient(-45deg, #1a1a1a, #2b2b2b, #3c3c3c, #4f4f4f);
    background-size: 400% 400%;
    animation: gradient 12s ease infinite;
}

@keyframes gradient {
    0% { background-position: 0% 50%; }
    50% { background-position: 100% 50%; }
    100% { background-position: 0% 50%; }
}

.galeria ul {
    list-style: none;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    justify-content: center;
    padding: 0;
    margin: 0;
}

.proyecto {
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 280px;
    border: 1px solid #444;
    border-radius: 8px;
    overflow: hidden;
    background-color: #333;
    color: #eee;
    transition: transform 0.3s;
    text-align: center;
}

.proyecto:hover {
    transform: scale(1.05);
}

.proyecto img {
    width: 100%;
    height: auto;
}

.proyecto-info {
    padding: 15px;
    text-align: center;
}

.proyecto-info h3 {
    margin: 10px 0;
    font-size: 1.2em;
    color: #ffcc00;
}

.proyecto-info p {
    font-size: 0.95em;
    color: #bbb;
}

.proyecto-links {
    margin-top: 15px;
    display: flex;
    justify-content: center;
    width: 100%;
}

.btn-ver-mas {
    background-color: #007bff;
    color: #fff;
    padding: 10px 20px;
    border-radius: 4px;
    text-decoration: none;
    transition: background-color 0.3s;
    text-align: center;
    display: inline-block;
}

.btn-ver-mas:hover {
    background-color: #0056b3;
}
</style>

