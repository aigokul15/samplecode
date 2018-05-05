
import React, { Component } from 'react';

function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

class Comp extends Component {
  render() {
    return (
      <Welcome name="Sara" />
    )};
}

export default Comp;
