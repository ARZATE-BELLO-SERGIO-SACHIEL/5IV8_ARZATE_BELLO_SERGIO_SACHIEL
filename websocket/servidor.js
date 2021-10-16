const {websocket} = require('events')
const websocket=require('ws')

const port = 2020

const server = new websocket.Server({
    port:port
})

server.on('headers',(Headers) => {

    console.log(Headers)
})

server.on('connection',(socket,req) => {

    console.log(req,headers)
})