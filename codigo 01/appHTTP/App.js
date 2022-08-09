import React, { Component } from 'react';
import { View, StyleSheet, FlatList, ActivityIndicator } from 'react-native';

import api from './src/services/conexaoapi';
import Filmes from './src/Filmes/filmes';

class App extends Component {

  constructor(props){
    super(props);
    this.state = {
      filmes: [],
      loading: true
    };
  }

  async componentDidMount(){
    const response = await api.get('/62900d7205f31f68b3a91a8c');
    this.setState({
      filmes: response.data,
      loading: false
    });
  }

  render() {

    if(this.state.loading){
      return(
        <View style={{alignItems: 'center', justifyContent: 'center', flex:1}}>
          <ActivityIndicator color="#09A6FF" size={40}/>
        </View>
      )
    }else{
      return(
        <View style={styles.container}>
  
          <FlatList
          data={this.state.filmes}
          keyExtractor={item => item.id.toString() }
          renderItem={ ({item}) => <Filmes data={item} /> }
          />
  
        </View>
      )
    }
  }
}

const styles = StyleSheet.create({
  container:{
    flex:1,
  }
});

export default App;