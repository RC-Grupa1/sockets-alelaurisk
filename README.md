[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/UwOds2hL)


1. Descriere generala

Acest proiect implementeaza doua tipuri de comunicare intre un client si un server:

TCP (Transmission Control Protocol) – comunicare cu conexiune, fiabila
UDP (User Datagram Protocol) – comunicare fara conexiune, mai rapida dar nefiabila

Aplicatia permite trimiterea de mesaje intre client si server in mod secvential (tip "Ping-Pong").

2. Comunicarea TCP (cu conexiune)
🔗 Cum se realizeaza conexiunea

In TCP, comunicarea necesita stabilirea unei conexiuni intre client si server prin 3-way handshake:

Client → Server: SYN (cerere de conexiune)
Server → Client: SYN-ACK (acceptare)
Client → Server: ACK (confirmare)

Dupa acest proces, conexiunea este stabilita si datele pot fi transmise.