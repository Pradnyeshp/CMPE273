import React, { Component } from 'react';
import './App.css';
import {Link} from 'react-router-dom';

class Profile extends Component {

    constructor() {
        super();
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit = () =>
    {
        //sessionStorage.clear() ;
        sessionStorage.removeItem('username');
        console.log(sessionStorage);        
    }

    render() {
        return (
            <div className="profile">
                <form>
                    <label>Name :
                        <input type="text" ref="name"  />
                    </label><br/>
                    <label>Email :
                        <input type="text" ref="email"  />
                    </label><br />
                    <label>Phone Number :
                        <input type="text" ref="phone"  />
                    </label><br />
                    <label>About Me :
                        <input type="text" ref="aboutme" />
                    </label><br />
                    <label>Skills :
                        <input type="text" ref="email"  />
                    </label><br />
                    <label>Profile Image :
                        <input type="text" ref="email"  />
                    </label><br />
                    <button>Edit</button><br/>
                    <Link to='/' className='btn btn-danger' onClick={this.handleSubmit}>LogOut</Link>
                </form>
            </div>
        );
    }
}

export default Profile;
