import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import CountryReducers from './store/reducer/reducer';
import { createStore } from 'redux'; 
import { Provider } from 'react-redux';
const store = createStore(CountryReducers);

ReactDOM.render(<Provider store={store}><App /></Provider>, document.getElementById('root'));

serviceWorker.unregister();


