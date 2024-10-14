'use client';

export default function Modal(props) {

  function deleteMe() {
    props.deleteCard(props.title);
    props.myOnCancel();
  }

  return (
      <div className="modal">
        <p>Are you sure?</p>
        <button className='btn btn--alt' onClick={props.myOnCancel}>Cancel</button>
        {/*<button className='btn' onClick={props.deleteCard(props.title)}>Confirm</button>*/}
        <button className='btn' onClick={deleteMe}>Confirm</button>
      </div>
  );
}