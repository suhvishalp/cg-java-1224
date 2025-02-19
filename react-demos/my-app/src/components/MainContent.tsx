import React, { Component } from 'react';


type MyState = { count :number, tenCounts:number }

class MainContent extends Component<{}, MyState> {

    constructor(props :{}){
        super(props);
        this.state = {
            count: 0,
            tenCounts: 0
            //..
            
            //
            //
        }
    }

    handleIncrement = () => {
        // this.setState({count: this.state.count+1})
        
        // const count = this.state.count + 1;
        // this.setState({count})

        this.setState((prevState)=> {
            return {
                count : prevState.count+1
            }
        })

        if(this.state.count==10){
            this.setState({tenCounts: this.state.tenCounts+1})
        }
    }

    handleDecrement = () => {
        this.setState({count: this.state.count-1})
    }


    render() {

        const {count, tenCounts} = this.state;

        return (
            <div>
                <h1>MainContent Component</h1>
                <h2>Count : {count}</h2>

                <button onClick={this.handleIncrement} className="btn btn-primary">Increment</button>
                <button onClick={this.handleDecrement} className="btn btn-primary">Decrement</button>

            </div>
        );
    }
}

export default MainContent;