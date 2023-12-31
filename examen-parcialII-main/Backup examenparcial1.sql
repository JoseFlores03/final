PGDMP                      {            exapar    16.0    16.0     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16397    exapar    DATABASE     |   CREATE DATABASE exapar WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Paraguay.1252';
    DROP DATABASE exapar;
                postgres    false            �            1259    16425    ciudad_id_seq    SEQUENCE     v   CREATE SEQUENCE public.ciudad_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.ciudad_id_seq;
       public          postgres    false            �            1259    16398    ciudad    TABLE     �   CREATE TABLE public.ciudad (
    id integer DEFAULT nextval('public.ciudad_id_seq'::regclass) NOT NULL,
    ciudad character varying(30),
    departamento character varying(30),
    postal integer
);
    DROP TABLE public.ciudad;
       public         heap    postgres    false    220            �            1259    16427    cliente_id_seq    SEQUENCE     w   CREATE SEQUENCE public.cliente_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.cliente_id_seq;
       public          postgres    false            �            1259    16408    cliente    TABLE     �   CREATE TABLE public.cliente (
    idcliente integer DEFAULT nextval('public.cliente_id_seq'::regclass) NOT NULL,
    idpersona integer,
    calificacion character varying(30),
    estado character varying(30),
    fechaingreso date
);
    DROP TABLE public.cliente;
       public         heap    postgres    false    221            �            1259    16429    cuentas_id_seq    SEQUENCE     w   CREATE SEQUENCE public.cuentas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.cuentas_id_seq;
       public          postgres    false            �            1259    16413    cuentas    TABLE     �  CREATE TABLE public.cuentas (
    idcuenta integer DEFAULT nextval('public.cuentas_id_seq'::regclass) NOT NULL,
    idcliente integer,
    tipocuenta character varying(100),
    estado character varying(100),
    saldo real,
    nrocuenta character varying(100),
    nrocontrato character varying(100),
    costomantenimiento real,
    promedioacreditacion character varying(100),
    moneda character varying(100),
    fechaalta date
);
    DROP TABLE public.cuentas;
       public         heap    postgres    false    222            �            1259    16431    movimientos_id_seq    SEQUENCE     {   CREATE SEQUENCE public.movimientos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.movimientos_id_seq;
       public          postgres    false            �            1259    16420    movimientos    TABLE     `  CREATE TABLE public.movimientos (
    idmovimiento integer DEFAULT nextval('public.movimientos_id_seq'::regclass) NOT NULL,
    idcuenta integer,
    tipomovimiento character varying(100),
    saldoanterior real,
    saldoactual real,
    montomovimiento real,
    cuentaorigen real,
    cuentadestino real,
    canal real,
    fechamovimiento date
);
    DROP TABLE public.movimientos;
       public         heap    postgres    false    223            �            1259    16433    persona_id_seq    SEQUENCE     w   CREATE SEQUENCE public.persona_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.persona_id_seq;
       public          postgres    false            �            1259    16403    persona    TABLE     �  CREATE TABLE public.persona (
    idpersona integer DEFAULT nextval('public.persona_id_seq'::regclass) NOT NULL,
    idciudad integer,
    nombre character varying(30),
    apellido character varying(30),
    tipodocumento character varying(30),
    nrodocumento character varying(30),
    direccion character varying(100),
    celular character varying(30),
    email character varying(100),
    estado character varying(30)
);
    DROP TABLE public.persona;
       public         heap    postgres    false    224            �          0    16398    ciudad 
   TABLE DATA           B   COPY public.ciudad (id, ciudad, departamento, postal) FROM stdin;
    public          postgres    false    215   "       �          0    16408    cliente 
   TABLE DATA           [   COPY public.cliente (idcliente, idpersona, calificacion, estado, fechaingreso) FROM stdin;
    public          postgres    false    217   l"       �          0    16413    cuentas 
   TABLE DATA           �   COPY public.cuentas (idcuenta, idcliente, tipocuenta, estado, saldo, nrocuenta, nrocontrato, costomantenimiento, promedioacreditacion, moneda, fechaalta) FROM stdin;
    public          postgres    false    218   �"       �          0    16420    movimientos 
   TABLE DATA           �   COPY public.movimientos (idmovimiento, idcuenta, tipomovimiento, saldoanterior, saldoactual, montomovimiento, cuentaorigen, cuentadestino, canal, fechamovimiento) FROM stdin;
    public          postgres    false    219   #       �          0    16403    persona 
   TABLE DATA           �   COPY public.persona (idpersona, idciudad, nombre, apellido, tipodocumento, nrodocumento, direccion, celular, email, estado) FROM stdin;
    public          postgres    false    216   5#       �           0    0    ciudad_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.ciudad_id_seq', 4, true);
          public          postgres    false    220            �           0    0    cliente_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.cliente_id_seq', 1, false);
          public          postgres    false    221            �           0    0    cuentas_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.cuentas_id_seq', 2, true);
          public          postgres    false    222            �           0    0    movimientos_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.movimientos_id_seq', 1, false);
          public          postgres    false    223            �           0    0    persona_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.persona_id_seq', 1, false);
          public          postgres    false    224            4           2606    16402    ciudad ciudad_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.ciudad
    ADD CONSTRAINT ciudad_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.ciudad DROP CONSTRAINT ciudad_pkey;
       public            postgres    false    215            8           2606    16412    cliente cliente_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (idcliente);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    217            :           2606    16419    cuentas cuentas_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.cuentas
    ADD CONSTRAINT cuentas_pkey PRIMARY KEY (idcuenta);
 >   ALTER TABLE ONLY public.cuentas DROP CONSTRAINT cuentas_pkey;
       public            postgres    false    218            <           2606    16424    movimientos movimientos_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.movimientos
    ADD CONSTRAINT movimientos_pkey PRIMARY KEY (idmovimiento);
 F   ALTER TABLE ONLY public.movimientos DROP CONSTRAINT movimientos_pkey;
       public            postgres    false    219            6           2606    16407    persona persona_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.persona
    ADD CONSTRAINT persona_pkey PRIMARY KEY (idpersona);
 >   ALTER TABLE ONLY public.persona DROP CONSTRAINT persona_pkey;
       public            postgres    false    216            �   V   x�3�t,.�K����tv�	r��4421�2�,N�S��/Jͫ�G�20�2��,IDY�qr��$�d楤r��E-�b���� ��      �   )   x�3�4�t*M�K�tL.�,K�4202�5��52������ �Oh      �   c   x�3�440�t.M�+ITHIUp��/*��tL.�,K�4500�4426153���t��	r��5 �14��M�+.M��v�4202�5��52�2���1z\\\ 1}+       �      x������ � �      �      x������ � �     