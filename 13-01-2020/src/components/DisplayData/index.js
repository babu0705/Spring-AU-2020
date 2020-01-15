import React from "react";
import regionalpollution from "../regionalpollution";
import { connect } from "react-redux";

class List extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      userList: regionalpollution
    };
  }

  // 	handleCheck=(e)=> {
  // 		var info=JSON.parse(e.target.innerText);
  // 			this.props.saveUserDetails('userarr', info);

  // 	}

  // 	render() {
  // 		let filterregionalpollution = this.state.userList.filter( function (user) {
  // 			return JSON.parse(JSON.stringify(user.state)) === "Andhra_Pradesh"
  // 		});

  // 		return (
  // 				<div >
  // 				<div style={{'word-break': "break-word",
  // 					'box-sizing' : "border-box",
  // 					'width': "50%",
  // 					'padding': "10px",
  // 					'overflow': "scroll",
  // 					'float':"left"}}>
  // 				{filterregionalpollution.map((d, idx) => {
  // 				return (<li  key={idx} onClick={this.handleCheck}>{JSON.stringify(d)}</li>)
  // 				})}
  // 				</div>

  // 				<div style={{'word-break': "break-word",
  // 					'box-sizing' : "border-box",
  // 					'width': "50%",
  // 					'padding': "10px",
  // 					'overflow': "scroll",
  // 					'float':"right"}}>
  // 				{this.props.arr.map((d, idx) => {
  // 				return (<li  key={idx}>{JSON.stringify(d)}</li>)
  // 				})}
  // 				</div>
  // 			</div>
  // 		)
  //       }
  // }

  handleCheck(e) {
    this.props.saveUserDetails("userarr", e);
  }

  render() {
    let filterregionalpollution = this.state.userList.filter(function(user) {
      return JSON.parse(JSON.stringify(user.state)) === "Karnataka";
    });

    return (
      <div>
        <style>
          {
            "table,td,th{border:1px solid black;background-color: #E4BDF3;}"
          }
        </style>

        <div
          style={{
            wordBreak: "normal",
            boxSizing: "border-box",
            width: "50%",
            padding: "10px",
            float: "left"
          }}
        >
          <table>
            <tbody>
              {filterregionalpollution.map((d, idx) => {
                return (
                  <tr key={idx} onClick={() => this.handleCheck(d)}>
                    <td>{d.id}</td>
                    <td>{d.country}</td>
                    <td>{d.state}</td>
                    <td>{d.city}</td>
                    <td>{d.station}</td>
                    <td>{d.last_update}</td>
                    <td>{d.pollutant_id}</td>
                    {/* <td>{d.pollutant_min}</td>
        <td>{d.pollutant_max}</td> */}
                    <td>{d.pollutant_avg}</td>
                    {/* <td>{d.pollutant_unit}</td> */}
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>

        <div
          style={{
            wordBreak: "normal",
            boxSizing: "border-box",
            width: "50%",
            padding: "10px",
            float: "right"
          }}
        >
          <table>
            <tbody>
              {this.props.arr.map((d, idx) => {
                return (
                  <tr key={idx}>
                    <td>{d.id}</td>
                    <td>{d.country}</td>
                    <td>{d.state}</td>
                    <td>{d.city}</td>
                    <td>{d.station}</td>
                    <td>{d.last_update}</td>
                    <td>{d.pollutant_id}</td>
                    {/* <td>{d.pollutant_min}</td>
                    <td>{d.pollutant_max}</td> */}
                    <td>{d.pollutant_avg}</td>
                    {/* <td>{d.pollutant_unit}</td> */}
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

const mapStateToProps = state => {
  return {
    arr: state.userarr
  };
};

const mapDispatchToProps = dispatch => {
  return {
    saveUserDetails: (name, val) => {
      dispatch({ type: "ADD_INFO", [name]: val });
    }
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(List);
