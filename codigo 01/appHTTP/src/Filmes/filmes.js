import React, {Component} from 'react';
import {View, Text, StyleSheet, TouchableOpacity} from 'react-native';

class Filmes extends Component{
  render(){
    const {nome, id, ra, curso, periodo, disciplina} = this.props.data;
    return(
      <View>
        
        <View style={styles.card}>
          <Text style={styles.titulo}>{id}</Text>
          <Text style={styles.titulo}>{ra}</Text>
          <Text style={styles.titulo}>{nome}</Text>
          <Text style={styles.titulo}>{curso}</Text>
          <Text style={styles.titulo}>{periodo}</Text>
          <Text style={styles.titulo}>{disciplina}</Text>

          <View style={styles.Areabotao}>
            <TouchableOpacity style={styles.botao} onPress={()=> alert(nome)}>
              <Text style={styles.botaoTexto}>LEIA MAIS</Text>
            </TouchableOpacity>
          </View>
        </View>

      </View>
    );
  }
}

const styles = StyleSheet.create({
  card:{
    shadowColor: '#000',
    backgroundColor: '#FFF',
    shadowOffset: {width:0, height: 1},
    shadowOpacity: 0.8,
    margin: 15,
    shadowRadius: 5,
    borderRadius: 5,
    elevation: 3,
  },
  titulo:{
    fontSize: 18,
    padding: 15,
  },
  capa:{
    height: 250,
    zIndex: 2,
  },
  Areabotao:{
    alignItems: 'flex-end',
    marginTop: -40,
    zIndex: 9
  },
  botao:{
    width: 100,
    backgroundColor: '#09A6FF',
    opacity: 1,
    padding: 8,
    borderTopLeftRadius: 5,
    borderBottomLeftRadius: 5,

  },
  botaoTexto:{
    textAlign: 'center',
    color: '#FFF'
  }
});

export default Filmes;