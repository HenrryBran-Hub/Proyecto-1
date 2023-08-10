import React, { useRef, useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';

const App = () => {
  const fileInputRef = useRef(null);
  const textarea1Ref = useRef(null);
  const [code, setCode] = useState('');
  const [currentFile, setCurrentFile] = useState(null);

  const handleAbrirClick = () => {
    fileInputRef.current.click();
  };

  const handleFileSelect = (event) => {
    const file = event.target.files[0];
    if (file) {
      setCurrentFile(file);
      const reader = new FileReader();
      reader.onload = (e) => {
        textarea1Ref.current.value = e.target.result;
      };
      reader.readAsText(file);
    }
  };

  const handleGuardarClick = () => {
    if (currentFile) {
      const blob = new Blob([textarea1Ref.current.value], {
        type: 'text/plain',
      });
      const url = URL.createObjectURL(blob);
      const a = document.createElement('a');
      a.href = url;
      a.download = currentFile.name;
      a.click();
      URL.revokeObjectURL(url);
      alert('Archivo actualizado');
    }
  };

  const handleAcercaDeClick = () => {
    alert('Henrry David Bran Velasquez \n201314439');
  };

  return (
    <>
      <input
        type="file"
        ref={fileInputRef}
        onChange={handleFileSelect}
        style={{ display: 'none' }}
      />
      <nav className="navbar navbar-dark bg-dark">
        <span className="navbar-brand mb-0 h1 text-light">T-Swift IDE</span>
      </nav>
      <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
        <div className="collapse navbar-collapse">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item">
              <button
                id="abrir"
                class="btn btn-outline-primary"
                onClick={handleAbrirClick}
              >
                Abrir
              </button>
            </li>
            <li className="nav-item">
              <button
                id="guardar"
                class="btn btn-outline-primary"
                onClick={handleGuardarClick}
              >
                Guardar
              </button>
            </li>
            <li className="nav-item">
              <button
                id="acerca-de"
                class="btn btn-outline-primary"
                onClick={handleAcercaDeClick}
              >
                Acerca de
              </button>
            </li>
          </ul>
        </div>
      </nav>
      <div className="container-fluid bg-dark text-light">
        <div className="row">
          <div className="col-md-6">
            <label htmlFor="textarea1">Editor</label>
            <hr />
            <textarea
              id="textarea1"
              ref={textarea1Ref}
              className="form-control bg-secondary text-light"
              rows="22"
              style={{ resize: 'none' }}
              value={code}
              onChange={(e) => setCode(e.target.value)}
            ></textarea>
          </div>
          <div className="col-md-6">
            <label htmlFor="textarea2">Consola</label>
            <hr />
            <textarea
              id="textarea2"
              className="form-control bg-secondary text-light"
              rows="22"
              style={{ resize: 'none' }}
              readOnly
            ></textarea>
          </div>
        </div>
        <hr />
        <div className="row">
          <div className="col-md-12 text-center">
            <button id="ejecutar" class="btn btn-outline-success">Ejecutar</button>
            <button
              id="mostrar-reportes"
              class="btn btn-outline-info"
            >
              Mostrar Reportes
            </button>
            <button id="simbolos" class="btn btn-outline-warning">Simbolos</button>
            <button id="errores" class="btn btn-outline-danger">Errores</button>
          </div>
          <hr />
          <hr />
        </div>
      </div>
    </>
  );
};

export default App;
