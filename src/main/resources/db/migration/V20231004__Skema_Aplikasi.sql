create table pembayaran (
    id varchar(36),
    waktu_transaksi datetime not null,
    keterangan varchar(100) not null,
    nilai decimal(19,2) not null,
    primary key (id)
);