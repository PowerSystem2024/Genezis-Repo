<script setup>
</script>

<template>
    <body>
        <div class="InteresesComponente">
            <div class="wave"></div>
            <div class="wave"></div>
            <div class="wave"></div>
        </div>
    </body>
</template>

<style scoped>
/* Fondo dinámico en modo oscuro con gradiente sutil */
@keyframes gradient {
    0% {
        background-position: 0% 0%;
    }
    50% {
        background-position: 100% 100%;
    }
    100% {
        background-position: 0% 0%;
    }
}

body {
    margin: 0;
    font-family: 'Poppins', sans-serif;
    overflow: hidden;
    background: linear-gradient(315deg, #2b2d42, #1c1f34, #4f5d73);
    animation: gradient 20s ease infinite;
    background-size: 400% 400%;
    background-attachment: fixed;
}

/* Olas con animación suave */
.wave {
    background: rgb(255 255 255 / 10%);
    border-radius: 1000% 1000% 0 0;
    position: fixed;
    width: 200%;
    height: 10em;
    animation: wave 12s -3s linear infinite;
    transform: translate3d(0, 0, 0);
    opacity: 0.6;
    bottom: 0;
    left: 0;
    z-index: -1;
}

.wave:nth-of-type(2) {
    bottom: -1.5em;
    animation: wave 18s linear reverse infinite;
    opacity: 0.6;
}

.wave:nth-of-type(3) {
    bottom: -3em;
    animation: wave 20s -1s reverse infinite;
    opacity: 0.7;
}

/* Animación de las olas, menos agresiva */
@keyframes wave {
    0% {
        transform: translateX(0);
    }

    50% {
        transform: translateX(-30%);
    }

    100% {
        transform: translateX(0);
    }
}

.InteresesComponente {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    text-align: center;
    color: #e5e5e5;
    z-index: 1;
}
</style>

    
    
   
