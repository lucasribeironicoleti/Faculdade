<template>
  <div>
    <h1>To-do List <div class="rgb">GAMER</div></h1>
    <hr>
    <input type="text" v-model="todo" nome="todo" id="todo" @keyup.enter="add(todo)">
    <br>
    <button @click="add(todo)">Inserir</button>
    <br>
    <h1>Minha Lista de Tarefas</h1>
    <br>
    <ul>
      <li v-for="todo in todos" :key="todo.id"         
        @dblclick="remove(todo)"
        @click="complete(todo)"
        :class="todo.done && 'complete'"
      >
      {{todo.name}}
      </li>
    </ul>
  </div>
</template>

<script>

export default {
  name: 'Todo List',
  created(){
    document.title='Aplicação To-do List'
  },
  data(){
    return {
      id: 0,
      todo: '',
      todos: []
    }
  },
  methods:{
    genId() {
      return (this.id += 1);
    },
    add(todo) {
      this.todos.push({
        id: this.genId(),
        name: todo,
        done: false,
      });
      this.todo = "";
    },
    getIndex(todo) {
      let index = this.todos.findIndex( item => item.id === todo.id );
      return index;      
    },
    remove(todo) {
      let index = this.getIndex(todo);
      this.todos.splice(index, 1);
    },
    complete(todo) {
      todo.done = !todo.done;
    },
  }
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Readex+Pro:wght@700&display=swap');
li{
  cursor: pointer;
  user-select: none;
  font-family: 'Readex Pro', sans-serif;
}
.complete{
  text-decoration: line-through;
  color: green;
}
button{
  border: 1px solid #0099ff;
  background: #0099ff;
  width: 100px;
  font-size: 1em;
}
button:hover{
  box-shadow: 0 12px 16px 0 rgba(0, 89, 255, 0.535), 0 17px 50px 0 rgb(0, 110, 255);
}
ul{
  list-style-type: decimal;
  padding-left: 45%;
  width: 10%
}
li{
  align-items: center;
  float: center;
  padding: 10px 5px;
}
h1{
  text-align: center;
}
input, button{
  display: block;
  margin: 0 auto;
}
button, h1{
  font-family: 'Readex Pro', sans-serif;
}
.rgb {
      width:100%;
      text-align: center;
      margin: 0 auto;
      
      color:#313131;
      font-size:45px;
      font-weight: bold;
      -webkit-animation:colorchange 5s infinite alternate;
      
      
    }

    @-webkit-keyframes colorchange {
      0% {
        color: rgb(255, 0, 0);
      }
      10% {
        color: #ffae00;
      }
      20% {
        color: #fbff00;
      }
      30% {
        color: #aaff00;
      }
      40% {
        color: rgb(0, 255, 21);
      }
      50% {
        color: #00ff6a;
      }
      60% {
        color: rgb(0, 255, 242);
      }
      70% {
        color: #0099ff;
      }
      80% {
        color: #1e0ff1;
      }
      90% {
        color: #9c29b9;
      }
      100% {
        color: rgb(255, 0, 0);
      }
    }
</style>
