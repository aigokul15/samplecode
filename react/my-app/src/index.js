import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import './List.css';

//import App from './App';
//import Comp from './comp';
import List from './List';

import registerServiceWorker from './registerServiceWorker';

//ReactDOM.render(<App />, document.getElementById('root'));

ReactDOM.render(<List />, document.getElementById('root'));


registerServiceWorker();
