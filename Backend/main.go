package main

import (
	"encoding/json"
	"fmt"
	"net/http"
)

func main() {
	http.HandleFunc("/nombre", func(w http.ResponseWriter, r *http.Request) {
		names := []string{"Alice", "Bob", "Charlie", "David", "Eva"}
		randomName := names[0]
		data := map[string]string{"name": randomName}
		w.Header().Set("Content-Type", "application/json")
		json.NewEncoder(w).Encode(data)
	})

	http.HandleFunc("/direccion", func(w http.ResponseWriter, r *http.Request) {
		addresses := []string{"123 Main St", "456 Elm St", "789 Oak St", "321 Maple St", "654 Pine St"}
		randomAddress := addresses[0]
		data := map[string]string{"address": randomAddress}
		w.Header().Set("Content-Type", "application/json")
		json.NewEncoder(w).Encode(data)
	})

	// Configuración de CORS para permitir peticiones desde el frontend
	corsHandler := func(next http.Handler) http.Handler {
		return http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
			w.Header().Set("Access-Control-Allow-Origin", "*")
			w.Header().Set("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
			w.Header().Set("Access-Control-Allow-Headers", "Content-Type")
			next.ServeHTTP(w, r)
		})
	}

	fmt.Println("Servidor escuchando en http://localhost:8080")
	http.ListenAndServe(":8080", corsHandler(http.DefaultServeMux))
}
