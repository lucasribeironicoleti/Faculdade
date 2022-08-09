import axios from 'axios';

const api = axios.create({
  baseURL: 'https://api.jsonbin.io/b/62900d7205f31f68b3a91a8c'
});

export default api;