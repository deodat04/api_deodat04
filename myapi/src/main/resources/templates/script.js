// Récupérer les données de votre API et générer les lignes du tableau
fetch('http://localhost:8080')
  .then(response => response.json())
  .then(data => {
    const tableBody = document.querySelector('#productTable tbody');
    data.forEach(product => {
      const row = document.createElement('tr');
      row.innerHTML = `
        <td>${product.id}</td>
        <td>${product.categorie}</td>
        <td>${product.informations}</td>
        <td>${product.name}</td>
        <td>${product.quantity}</td>
        <td>
          <button onclick="updateProduct(${product.id})">Update</button>
          <button onclick="deleteProduct(${product.id})">Delete</button>
        </td>
      `;
      tableBody.appendChild(row);
    });
  });
 // Fonction pour mettre à jour un produit
function updateProduct(productId, updateProduct) {
    fetch(`/api/produits/${productId}`, {
        method: 'PUT',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(updatedProduct)
      })
      .then(response => response.json())
      .then(data => {
        // Gérer la réponse de la mise à jour du produit
        console.log(data);
      })
      .catch(error => {
        // Gérer les erreurs lors de la mise à jour du produit
        console.error(error);
      });
}
 // Fonction pour supprimer un produit
function deleteProduct(productId) {
    fetch(`/api/produits/${productId}`, {
        method: 'DELETE'
      })
      .then(response => response.text())
      .then(data => {
        // Gérer la réponse de la suppression du produit
        console.log(data);
      })
      .catch(error => {
        // Gérer les erreurs lors de la suppression du produit
        console.error(error);
      });
}