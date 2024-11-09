<script setup>
import linkedin from '/src/assets/linkedin_icon.svg';
import instagram from '/src/assets/instagram_icon.svg';
import github from '/src/assets/github_icon.svg';
import cv from '/src/assets/cv_resume_icon.svg';
import profilePic from '/src/assets/genezis_con_fondo.jpeg'; // Imagen de perfil

// Información del grupo
const title = 'Genezis';
const descripcion = 'Estudiantes de la Tecnicatura en Programación - UTN';
const residencia = 'San Rafael, Mendoza, Argentina';
const presentacion = 'Somos un grupo de estudiantes de la Tecnicatura en Programación en UTN, unidos por nuestra pasión por el desarrollo y la tecnología.';

// Redes sociales del grupo
const redesSociales = [
    { id: 1, name: 'linkedin', src: linkedin, url: 'https://www.linkedin.com/in/gabriel-garino-116337329/' },
    { id: 2, name: 'Instagram', src: instagram, url: 'https://www.instagram.com/gabi_garino_/' },
    { id: 3, name: 'github', src: github, url: 'https://github.com/Gabrielgettoo10' },
    { id: 4, name: 'curriculum', src: cv, url: '' }
];
</script>

<template>
    <section class="datos-personales">
        <div class="card">
            <img class="profile-image" :src="profilePic" alt="Imagen de perfil"> <!-- Imagen de perfil redondeada -->
            <h1>{{ title }}</h1>
            <h2>{{ descripcion }}</h2>
            <p>{{ presentacion }}</p>
            <ul class="container-lista">
                <li v-for="red in redesSociales" :key="red.id">
                    <a :href="red.url" target="_blank" rel="noopener noreferrer">
                        <img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name">
                    </a>
                </li>
            </ul>
            <h4>{{ residencia }}</h4>
        </div>
    </section>
</template>

<style scoped>
h1 {
    font-size: 2.5rem;
    color: #81d4fa;
}

h2 {
    font-size: 1.5rem;
    color: #80cbc4;
}

p {
    font-size: 1.2rem;
    font-weight: 600;
    margin-bottom: 1rem;
    color: #e0e0e0;
}

.card {
    background-color: rgb(28, 41, 52);
    border-radius: 10px;
    padding: 20px;
    margin: 20px;
    text-align: center;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
}

/* Imagen de perfil redondeada y centrada */
.profile-image {
    width: 150px; /* Aumenta el ancho */
    height: 150px; /* Aumenta la altura */
    border-radius: 50%;
    margin: 0 auto 15px auto; /* Centra la imagen y agrega espacio inferior */
    display: block;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
}

.container-lista {
    display: flex;
    justify-content: center;
    list-style: none;
    padding: 0;
    margin: 0;
}

.icon-redsocial {
    background-color: #e0e0e0;
    border-radius: 50%;
    padding: 8px;
    margin: 0 10px;
    box-shadow: 0 0 5px rgba(95, 124, 205, 0.9);
    transition: background-color 0.3s, box-shadow 0.3s;
}

.icon-redsocial:hover {
    background-color: rgb(28, 41, 52);
    box-shadow: 0 0 5px rgba(251, 249, 249, 0.9);
}

h4 {
    font-size: 1.1rem;
    color: #b0bec5;
    margin-top: 20px;
}
</style>
