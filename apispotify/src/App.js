import logo from './logo.svg';
import './App.css';
import React from 'react';
import $ from 'jquery';

class App extends React.Component {
  constructor(props) {
    super(props);
    const parametros = this.getHashParams();
    const token = parametros.access_token;
  }


  getHashParams() {
    var hashParams = {};
    var e, r = /([^&;=]+)=?([^&;]*)/g,
      q = window.location.hash.substring(1);
    e = r.exec(q)
    while (e) {
      hashParams[e[1]] = decodeURIComponent(e[2]);
      e = r.exec(q);
    }
    console.log(this.token)
    return hashParams;
  }

  topTracksLorde = () =>{
    $.ajax({
    method: "GET",
    dataType: "Json",
    url:"https://api.spotify.com/v1/artists/163tK9Wjr9P9DmM0AVK7lm/top-tracks?country=BR",
    headers: {
    Authorization: `Bearer ${this.token}`
    }
    })
    .then(dados => {
      console.log(dados.tracks[0].name)
      console.log(this.topTracksLorde)
    })
  }
  
  render() {
    return (
      <div className="App">
        <button><a href="http://localhost:8888">Logar com Spotify </a></button>
        <button onClick={this.topTracksLorde}>Buscar Top Tracks da Lorde</button>
      </div>
    );
  }
}

export default App;
