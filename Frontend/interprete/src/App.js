import React, { useState } from 'react';

function App() {
  const [name, setName] = useState('');
  const [address, setAddress] = useState('');

  const handleClickGetName = async () => {
    try {
      const response = await fetch('http://localhost:8080/nombre');
      const data = await response.json();
      setName(data.name);
    } catch (error) {
      console.error('Error fetching name:', error);
    }
  };

  const handleClickGetAddress = async () => {
    try {
      const response = await fetch('http://localhost:8080/direccion');
      const data = await response.json();
      setAddress(data.address);
    } catch (error) {
      console.error('Error fetching address:', error);
    }
  };

  return (
    <div>
      <button onClick={handleClickGetName}>Obtener nombre</button>
      <br />
      <input type="text" value={name} readOnly />
      <br />
      <button onClick={handleClickGetAddress}>Obtener dirección</button>
      <br />
      <input type="text" value={address} readOnly />
    </div>
  );
}

export default App;
