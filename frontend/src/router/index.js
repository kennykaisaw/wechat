import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/views/HomeView.vue'
import LoginView from '@/views/LoginView.vue'
import RegisterView from '@/views/RegisterView.vue'
import ChatView from '@/views/ChatView.vue'
import FriendsView from '@/views/FriendsView.vue'

const routes = [
  { path: '/', name: 'Home', component: HomeView },
  { path: '/login', name: 'Login', component: LoginView },
  { path: '/register', name: 'Register', component: RegisterView },
  { path: '/chat', name: 'Chat', component: ChatView },
  { path: '/friends', name: 'Friends', component: FriendsView }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router 