# 💡 InstaLed API

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-6DB33F?style=for-the-badge&logo=spring)](https://spring.io/)
[![Docker](https://img.shields.io/badge/Docker-Ready-2496ED?style=for-the-badge&logo=docker)](https://www.docker.com/)

API backend em **Java / Spring Boot** para orquestração de efeitos, perfis de cor e agendamento de iluminação LED inteligente.

---

## 📌 Sobre o Projeto

O **InstaLed** é uma plataforma IoT de automação e customização de iluminação decorativa e arquitetural. Esta API gerencia os modos de iluminação, paletas de cores, sincronização com música e comandos enviados para os microcontroladores via rede local ou MQTT.

## 🚀 Funcionalidades

- 🎨 **Cenas e Perfis de Cores:** Criação e persistência de combinações de cores e animações.
- ⏰ **Agendamento Inteligente:** Rotinas de acendimento/apagamento automático por horário.
- 📡 **Integração com Hardware:** Comunicação direta com o firmware ESP32 (`instaled-firmware`).
- 🐳 **Deploy Ágil:** Configuração pronta com Docker e docker-compose.

## 🛠️ Tecnologias Utilizadas

- **Java 17** & **Spring Boot 3**
- **Maven**
- **Docker Compose**

## ⚙️ Como Executar Localmente

```bash
git clone https://github.com/IuryAlmeidaDev/instaled-api.git
cd instaled-api
./mvnw clean spring-boot:run
```

---

## 👤 Autor

Desenvolvido por **[Iury Almeida](https://github.com/IuryAlmeidaDev)**.
