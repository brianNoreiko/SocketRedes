# SocketRedes

1. ¿Que es un puerto?
Un puerto de red es una interfaz para comunicarse con un programa a través de una red. Los números de puerto se indican mediante una palabra de un procesador de 16 bits, o sea, de 2 bytes (16 bits) y su valor varía entre 0 y 65535.

2. ¿Como estan formados los endpoints?
Están formados por diversos elementos como sistemas operativos, licencias anti-virus o cliente VPN, todos ellos actualizados

3. ¿Que es un socket?
Los sockets son un mecanismo que nos permite establecer un enlace entre dos programas que se ejecutan independientes el uno del otro (generalmente un programa cliente y un programa servidor).

4. ¿A qué capa del modelo TPC/IP pertenecen los sockets? ¿Porque?
Los sockets pertenecen a la capa de transporte, ya que usa protocolos de esta capa para su funcionamiento. Las aplicaciones que emplean sockets son diseñadas para utilizar tanto del modelo UDP o TCP su capa de transporte, siempre y cuando que los protocolos especificados en su capa satisfagan el tipo de conexión que requiere la aplicación.

5. ¿Cómo funciona el modelo cliente-servidor con TCP/IP Sockets?
Los usuarios invocan la parte cliente de la aplicación, que construye una solicitud para ese servicio y se la envía al servidor de la aplicación que usa TCP/IP como transporte. El servidor recibe una solicitud, realiza el servicio requerido y devuelve los resultados en forma de una respuesta

6. ¿Cuales son las causas comunes por la que la conexión entre cliente/servidor falle?
Las causas comunes por la que la conexión entre cliente/servidor falle son: Error 2200: El cliente no recibió una respuesta del servidor en un tiempo determinado (timeout); esto sucede solo si un límite de tiempo fue especificado. Error 2300: El servidor cerró la conexión. Error 2310: El servidor se ha caído mientras intentaba procesar el Handshake Request (conexión con el cliente). La conexión se cerró. Error 2315: El servidor recibió el Handshake Request (conexión con el cliente) y devolvió una respuesta del tipo non-IIOP que el cliente no puede procesar (El cliente recibe una respuesta en un lenguage que no entinede).

7. Diferencias entre sockets UDP y TCP
La principal diferencia entre TCP y UDP pasa fundamentalmente por el sistema de verificación de la transmisión de la información entre el dispositivo emisor y el dispositivo receptor. Como acabamos de ver, el protocolo TCP es un protocolo de transporte orientado a conexión, mientras que el protocolo UDP no lo es. De esta manera, el protocolo TCP verifica la correcta transmisión de los datos entre los dispositivos emisores y los receptores, mientras que el protocolo UDP no lo hace.
Por esto, el protocolo UDP cuenta con una velocidad de transmisión superior a la del protocolo TCP, si bien lo hace a costa de una pérdida de precisión en la transmisión de la información.
Entrando en apartados algo más técnicos, encontramos que el protocolo TCP cuenta con un sistema de control de congestión y de flujo del tráfico, mientras que el protocolo UCP carece de él.
Por último, el tamaño de la cabecera del protocolo TCP es de 20 bytes, mientras que el del protocolo UCP es de solo 8 bytes. Esto responde a la necesidad del protocolo TCP de incluir más información en los paquetes para poder comprobar y subsanar después los posibles errores de transmisión.

8. Diferencia entre sync & async sockets?
Decimos que un socket es sincrónico cuando los clientes interactúan con el servidor en orden. Esto significa que cuando el servidor se encuentre interactuando con un cliente y otro cliente desee hacer lo mismo, quedara en espera hasta que el servidor se desocupe. Pero un socket asincrónico permite que varios clientes interactúen a la vez con el servidor sin la necesidad de esperar a que este se encuentre desocupado.