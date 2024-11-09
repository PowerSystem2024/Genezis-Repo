<template>
  <nav class="navbar">
      <div class="navbar-menu">
          <ul class="nav-list">
              <li v-for="nav in navegacion" :key="nav.id">
                  <a :href="nav.enlace" class="nav-item">{{ nav.nombre }}</a>
              </li>
          </ul>
      </div>
  </nav>
</template>

<script setup>
import { ref } from 'vue';

const navegacion = ref([
  { id: 1, nombre: 'Educación', enlace: '#educacion' },
  { id: 2, nombre: 'Experiencia', enlace: '#experiencia' },
  { id: 3, nombre: 'Proyectos', enlace: '#proyectos' },
  { id: 4, nombre: 'Habilidades', enlace: '#habilidades' },
  { id: 5, nombre: 'Intereses', enlace: '#intereses' }
]);
</script>

<style scoped>
.navbar {
  background-color: var(--vt-c-indigo);
  color: #fff;
  padding: 0.5rem 1rem;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.navbar-menu {
  display: flex;
  justify-content: flex-end;
  width: 100%;
}

.nav-list {
  list-style: none;
  display: flex;
  padding: 0;
  margin: 0;
}

.nav-item {
  color: #fff;
  text-decoration: none;
  margin-right: 1rem;
  padding: 10px 15px; /* Aumenté el padding para hacerlo más cómodo */
  border: 1px solid transparent; /* El borde será transparente de inicio */
  border-radius: 5px;
  transition: background-color 0.3s, color 0.3s, border 0.3s;
}

/* Cambios al pasar el mouse */
.nav-item:hover {
  background-color: hsla(160, 100%, 37%, 0.2); /* Color de fondo al pasar el mouse */
  color: var(--vt-c-indigo); /* Color de texto */
  border: 1px solid hsla(160, 100%, 37%, 0.6); /* Borde más visible */
}

/* Estilo para cuando el item está seleccionado */
.nav-item:active {
  background-color: hsla(160, 100%, 37%, 0.4); /* Fondo más oscuro al hacer clic */
  color: white; /* Mantiene el texto blanco */
}

@media (max-width: 768px) {
  .navbar-menu {
    width: 100%;
    justify-content: space-around;
  }
}
</style>
