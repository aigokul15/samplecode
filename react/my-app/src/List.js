
import React, { Component } from 'react';

class List extends Component {
  render() {
    return (
      <div id="tasks">
        <h1> Tasks (length) </h1>

        <ol class="list-group">

          <li class="list-group-item">

          <span>Task List</span>

          <button >&#10007;</button>
          <button  >&#10004;</button>

          </li>

          <li class="list-group-item">

          <span>Task List1</span>

          <button >&#10007;</button>
          <button  >&#10004;</button>

          </li>
        </ol>
      </div>

    )};
}

export default List;
