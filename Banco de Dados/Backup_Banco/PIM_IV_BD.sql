PGDMP                     
    y            gerenciadorhoteleiro    13.4    13.4 7    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                        1262    24579    gerenciadorhoteleiro    DATABASE     t   CREATE DATABASE gerenciadorhoteleiro WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
 $   DROP DATABASE gerenciadorhoteleiro;
                postgres    false                       0    0    gerenciadorhoteleiro    DATABASE PROPERTIES     ;   ALTER DATABASE gerenciadorhoteleiro CONNECTION LIMIT = 15;
                     postgres    false            ?            1259    24616    apartamento    TABLE     ?   CREATE TABLE public.apartamento (
    idapartamento integer NOT NULL,
    nome character varying(60) NOT NULL,
    duracaoestadia date NOT NULL,
    duracaoreserva date NOT NULL,
    telefone integer
);
    DROP TABLE public.apartamento;
       public         heap    postgres    false            ?            1259    24636 	   categoria    TABLE     ?   CREATE TABLE public.categoria (
    idcategoria integer NOT NULL,
    descricao character varying(45),
    setor character varying(45)
);
    DROP TABLE public.categoria;
       public         heap    postgres    false            ?            1259    24621    consumo    TABLE     ?   CREATE TABLE public.consumo (
    idconsumo integer NOT NULL,
    hospedagem_idhospedagem integer,
    produtos_idprodutos integer,
    quantidade integer,
    valor integer
);
    DROP TABLE public.consumo;
       public         heap    postgres    false            ?            1259    24594    empresas    TABLE     ?   CREATE TABLE public.empresas (
    idempresa integer NOT NULL,
    nome character varying(50) NOT NULL,
    cnpj integer,
    endereco character varying(60) NOT NULL,
    telefone integer,
    fatura_idfatura integer
);
    DROP TABLE public.empresas;
       public         heap    postgres    false            ?            1259    24601    fatura    TABLE     ?   CREATE TABLE public.fatura (
    idfatura integer NOT NULL,
    empresa_idempresa integer,
    lancamentos_idlancamentos integer
);
    DROP TABLE public.fatura;
       public         heap    postgres    false            ?            1259    65700    funcionario    TABLE     ?   CREATE TABLE public.funcionario (
    idfuncionario integer NOT NULL,
    nome character varying(45) NOT NULL,
    cpf integer,
    rg integer,
    datanascimento date NOT NULL,
    dataadmissao date NOT NULL
);
    DROP TABLE public.funcionario;
       public         heap    postgres    false            ?            1259    65698    funcionario_idfuncionario_seq    SEQUENCE     ?   CREATE SEQUENCE public.funcionario_idfuncionario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.funcionario_idfuncionario_seq;
       public          postgres    false    210                       0    0    funcionario_idfuncionario_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.funcionario_idfuncionario_seq OWNED BY public.funcionario.idfuncionario;
          public          postgres    false    209            ?            1259    24611 
   hospedagem    TABLE     ?  CREATE TABLE public.hospedagem (
    idhospedagem integer NOT NULL,
    hospede_idhospede integer,
    apartamento_idapartamento integer,
    nome character varying(60),
    entrada date,
    saida date,
    horaentrada time without time zone,
    horasaida time without time zone,
    descricao character varying(45),
    lancamentos_idlancamentos integer,
    consumo_idconsumo integer
);
    DROP TABLE public.hospedagem;
       public         heap    postgres    false            ?            1259    24587    hospedes    TABLE     ?  CREATE TABLE public.hospedes (
    idhospede integer NOT NULL,
    empresa_idempresa integer,
    nome character varying(45) NOT NULL,
    cpf integer,
    rg integer,
    endereco character varying(60) NOT NULL,
    numero integer,
    telefone integer,
    datanascimento date NOT NULL,
    nacionalidade character varying(60),
    email character varying(60),
    numquarto integer,
    hospedagem_idhospedagem integer
);
    DROP TABLE public.hospedes;
       public         heap    postgres    false            ?            1259    24606    lancamentos    TABLE     ?   CREATE TABLE public.lancamentos (
    idlancamentos integer NOT NULL,
    fatura_idfatura integer,
    consumo_idconsumo integer,
    hospedagem_idhospedagem integer
);
    DROP TABLE public.lancamentos;
       public         heap    postgres    false            ?            1259    24626    produtos    TABLE     ?   CREATE TABLE public.produtos (
    idprodutos integer NOT NULL,
    categoria_idcategoria integer,
    idconsumo integer,
    nome character varying(60),
    tipo character varying(50),
    valor integer
);
    DROP TABLE public.produtos;
       public         heap    postgres    false            F           2604    65703    funcionario idfuncionario    DEFAULT     ?   ALTER TABLE ONLY public.funcionario ALTER COLUMN idfuncionario SET DEFAULT nextval('public.funcionario_idfuncionario_seq'::regclass);
 H   ALTER TABLE public.funcionario ALTER COLUMN idfuncionario DROP DEFAULT;
       public          postgres    false    210    209    210            ?          0    24616    apartamento 
   TABLE DATA           d   COPY public.apartamento (idapartamento, nome, duracaoestadia, duracaoreserva, telefone) FROM stdin;
    public          postgres    false    205   
G       ?          0    24636 	   categoria 
   TABLE DATA           B   COPY public.categoria (idcategoria, descricao, setor) FROM stdin;
    public          postgres    false    208   'G       ?          0    24621    consumo 
   TABLE DATA           m   COPY public.consumo (idconsumo, hospedagem_idhospedagem, produtos_idprodutos, quantidade, valor) FROM stdin;
    public          postgres    false    206   DG       ?          0    24594    empresas 
   TABLE DATA           ^   COPY public.empresas (idempresa, nome, cnpj, endereco, telefone, fatura_idfatura) FROM stdin;
    public          postgres    false    201   aG       ?          0    24601    fatura 
   TABLE DATA           X   COPY public.fatura (idfatura, empresa_idempresa, lancamentos_idlancamentos) FROM stdin;
    public          postgres    false    202   ~G       ?          0    65700    funcionario 
   TABLE DATA           a   COPY public.funcionario (idfuncionario, nome, cpf, rg, datanascimento, dataadmissao) FROM stdin;
    public          postgres    false    210   ?G       ?          0    24611 
   hospedagem 
   TABLE DATA           ?   COPY public.hospedagem (idhospedagem, hospede_idhospede, apartamento_idapartamento, nome, entrada, saida, horaentrada, horasaida, descricao, lancamentos_idlancamentos, consumo_idconsumo) FROM stdin;
    public          postgres    false    204   ?G       ?          0    24587    hospedes 
   TABLE DATA           ?   COPY public.hospedes (idhospede, empresa_idempresa, nome, cpf, rg, endereco, numero, telefone, datanascimento, nacionalidade, email, numquarto, hospedagem_idhospedagem) FROM stdin;
    public          postgres    false    200   ?G       ?          0    24606    lancamentos 
   TABLE DATA           q   COPY public.lancamentos (idlancamentos, fatura_idfatura, consumo_idconsumo, hospedagem_idhospedagem) FROM stdin;
    public          postgres    false    203   H       ?          0    24626    produtos 
   TABLE DATA           c   COPY public.produtos (idprodutos, categoria_idcategoria, idconsumo, nome, tipo, valor) FROM stdin;
    public          postgres    false    207   7H                  0    0    funcionario_idfuncionario_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.funcionario_idfuncionario_seq', 1, false);
          public          postgres    false    209            V           2606    24620    apartamento apartamento_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.apartamento
    ADD CONSTRAINT apartamento_pkey PRIMARY KEY (idapartamento);
 F   ALTER TABLE ONLY public.apartamento DROP CONSTRAINT apartamento_pkey;
       public            postgres    false    205            \           2606    24640    categoria categoria_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (idcategoria);
 B   ALTER TABLE ONLY public.categoria DROP CONSTRAINT categoria_pkey;
       public            postgres    false    208            X           2606    24625    consumo consumo_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.consumo
    ADD CONSTRAINT consumo_pkey PRIMARY KEY (idconsumo);
 >   ALTER TABLE ONLY public.consumo DROP CONSTRAINT consumo_pkey;
       public            postgres    false    206            L           2606    24600    empresas empresas_cnpj_key 
   CONSTRAINT     U   ALTER TABLE ONLY public.empresas
    ADD CONSTRAINT empresas_cnpj_key UNIQUE (cnpj);
 D   ALTER TABLE ONLY public.empresas DROP CONSTRAINT empresas_cnpj_key;
       public            postgres    false    201            N           2606    24598    empresas empresas_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.empresas
    ADD CONSTRAINT empresas_pkey PRIMARY KEY (idempresa);
 @   ALTER TABLE ONLY public.empresas DROP CONSTRAINT empresas_pkey;
       public            postgres    false    201            P           2606    24605    fatura fatura_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.fatura
    ADD CONSTRAINT fatura_pkey PRIMARY KEY (idfatura);
 <   ALTER TABLE ONLY public.fatura DROP CONSTRAINT fatura_pkey;
       public            postgres    false    202            ^           2606    65707    funcionario funcionario_cpf_key 
   CONSTRAINT     Y   ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_cpf_key UNIQUE (cpf);
 I   ALTER TABLE ONLY public.funcionario DROP CONSTRAINT funcionario_cpf_key;
       public            postgres    false    210            `           2606    65705    funcionario funcionario_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_pkey PRIMARY KEY (idfuncionario);
 F   ALTER TABLE ONLY public.funcionario DROP CONSTRAINT funcionario_pkey;
       public            postgres    false    210            T           2606    24615    hospedagem hospedagem_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.hospedagem
    ADD CONSTRAINT hospedagem_pkey PRIMARY KEY (idhospedagem);
 D   ALTER TABLE ONLY public.hospedagem DROP CONSTRAINT hospedagem_pkey;
       public            postgres    false    204            H           2606    24593    hospedes hospedes_cpf_key 
   CONSTRAINT     S   ALTER TABLE ONLY public.hospedes
    ADD CONSTRAINT hospedes_cpf_key UNIQUE (cpf);
 C   ALTER TABLE ONLY public.hospedes DROP CONSTRAINT hospedes_cpf_key;
       public            postgres    false    200            J           2606    24591    hospedes hospedes_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.hospedes
    ADD CONSTRAINT hospedes_pkey PRIMARY KEY (idhospede);
 @   ALTER TABLE ONLY public.hospedes DROP CONSTRAINT hospedes_pkey;
       public            postgres    false    200            R           2606    24610    lancamentos lancamentos_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.lancamentos
    ADD CONSTRAINT lancamentos_pkey PRIMARY KEY (idlancamentos);
 F   ALTER TABLE ONLY public.lancamentos DROP CONSTRAINT lancamentos_pkey;
       public            postgres    false    203            Z           2606    24630    produtos produtos_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.produtos
    ADD CONSTRAINT produtos_pkey PRIMARY KEY (idprodutos);
 @   ALTER TABLE ONLY public.produtos DROP CONSTRAINT produtos_pkey;
       public            postgres    false    207            a           2606    24646    hospedes empresa_idempresa_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.hospedes
    ADD CONSTRAINT empresa_idempresa_fkey FOREIGN KEY (empresa_idempresa) REFERENCES public.empresas(idempresa) NOT VALID;
 I   ALTER TABLE ONLY public.hospedes DROP CONSTRAINT empresa_idempresa_fkey;
       public          postgres    false    2894    201    200            b           2606    24691 %   hospedes hospedagem_idhospedagem_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.hospedes
    ADD CONSTRAINT hospedagem_idhospedagem_fkey FOREIGN KEY (hospedagem_idhospedagem) REFERENCES public.hospedagem(idhospedagem) NOT VALID;
 O   ALTER TABLE ONLY public.hospedes DROP CONSTRAINT hospedagem_idhospedagem_fkey;
       public          postgres    false    2900    204    200            f           2606    24676    hospedagem idapartamento_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.hospedagem
    ADD CONSTRAINT idapartamento_fkey FOREIGN KEY (apartamento_idapartamento) REFERENCES public.apartamento(idapartamento) NOT VALID;
 G   ALTER TABLE ONLY public.hospedagem DROP CONSTRAINT idapartamento_fkey;
       public          postgres    false    2902    205    204            m           2606    24651    categoria idcategoria_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.categoria
    ADD CONSTRAINT idcategoria_fkey FOREIGN KEY (idcategoria) REFERENCES public.consumo(idconsumo) NOT VALID;
 D   ALTER TABLE ONLY public.categoria DROP CONSTRAINT idcategoria_fkey;
       public          postgres    false    2904    208    206            k           2606    24701    produtos idcategoria_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.produtos
    ADD CONSTRAINT idcategoria_fkey FOREIGN KEY (categoria_idcategoria) REFERENCES public.categoria(idcategoria) NOT VALID;
 C   ALTER TABLE ONLY public.produtos DROP CONSTRAINT idcategoria_fkey;
       public          postgres    false    207    2908    208            h           2606    24686    hospedagem idconsumo_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.hospedagem
    ADD CONSTRAINT idconsumo_fkey FOREIGN KEY (consumo_idconsumo) REFERENCES public.consumo(idconsumo) NOT VALID;
 C   ALTER TABLE ONLY public.hospedagem DROP CONSTRAINT idconsumo_fkey;
       public          postgres    false    204    2904    206            e           2606    24696    lancamentos idconsumo_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.lancamentos
    ADD CONSTRAINT idconsumo_fkey FOREIGN KEY (consumo_idconsumo) REFERENCES public.consumo(idconsumo) NOT VALID;
 D   ALTER TABLE ONLY public.lancamentos DROP CONSTRAINT idconsumo_fkey;
       public          postgres    false    206    2904    203            l           2606    24706    produtos idconsumo_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.produtos
    ADD CONSTRAINT idconsumo_fkey FOREIGN KEY (idconsumo) REFERENCES public.consumo(idconsumo) NOT VALID;
 A   ALTER TABLE ONLY public.produtos DROP CONSTRAINT idconsumo_fkey;
       public          postgres    false    207    206    2904            c           2606    24666    empresas idfatura_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.empresas
    ADD CONSTRAINT idfatura_fkey FOREIGN KEY (fatura_idfatura) REFERENCES public.fatura(idfatura) NOT VALID;
 @   ALTER TABLE ONLY public.empresas DROP CONSTRAINT idfatura_fkey;
       public          postgres    false    202    201    2896            j           2606    24661    consumo idhospedagem_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.consumo
    ADD CONSTRAINT idhospedagem_fkey FOREIGN KEY (hospedagem_idhospedagem) REFERENCES public.hospedagem(idhospedagem) NOT VALID;
 C   ALTER TABLE ONLY public.consumo DROP CONSTRAINT idhospedagem_fkey;
       public          postgres    false    204    2900    206            d           2606    24671    fatura idlancamentos_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.fatura
    ADD CONSTRAINT idlancamentos_fkey FOREIGN KEY (lancamentos_idlancamentos) REFERENCES public.lancamentos(idlancamentos) NOT VALID;
 C   ALTER TABLE ONLY public.fatura DROP CONSTRAINT idlancamentos_fkey;
       public          postgres    false    202    203    2898            g           2606    24681    hospedagem idlancamentos_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.hospedagem
    ADD CONSTRAINT idlancamentos_fkey FOREIGN KEY (lancamentos_idlancamentos) REFERENCES public.lancamentos(idlancamentos) NOT VALID;
 G   ALTER TABLE ONLY public.hospedagem DROP CONSTRAINT idlancamentos_fkey;
       public          postgres    false    203    2898    204            i           2606    24656    consumo idprodutos_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.consumo
    ADD CONSTRAINT idprodutos_fkey FOREIGN KEY (produtos_idprodutos) REFERENCES public.produtos(idprodutos) NOT VALID;
 A   ALTER TABLE ONLY public.consumo DROP CONSTRAINT idprodutos_fkey;
       public          postgres    false    207    206    2906            ?      x?????? ? ?      ?      x?????? ? ?      ?      x?????? ? ?      ?      x?????? ? ?      ?      x?????? ? ?      ?   5   x?3?I-.I?4426153???41710324?4202?54?52Dbr??qqq ;?
Z      ?      x?????? ? ?      ?      x?????? ? ?      ?      x?????? ? ?      ?      x?????? ? ?     